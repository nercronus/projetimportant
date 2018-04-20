/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.Servlet;

import StreamingWeb.entity.Film;
import StreamingWeb.entity.Genre;
import StreamingWeb.service.FilmService;
import StreamingWeb.service.FilmServiceJpaImpl;
import StreamingWeb.service.GenreService;
import StreamingWeb.service.GenreServiceJpaImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Formation
 */
@WebServlet(name = "AjouterFilmServlet", urlPatterns = {"/ajouter_film"})
public class AjouterFilmServlet extends HttpServlet {
    
    private FilmService filmService = new FilmServiceJpaImpl();
    private GenreService service = new GenreServiceJpaImpl();
    
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         Film f = new Film();
        
        f.setTitre(req.getParameter("Titre"));
        f.setSynopsis(req.getParameter("Synopsis"));
        
        long genreId = Long.parseLong(req.getParameter("genreId"));
        
         Genre g = new Genre();
         g.setId(genreId);
         
         g.getFilmList().add(f);
         f.setGenre(g);
         
         // Insert en BD
         
         filmService.ajouterFilm(f);
         
         // Redirection vers liste films
         resp.sendRedirect("lister_films");
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       req.setAttribute("genreList", service.listerGenres());
       
        req.getRequestDispatcher("ajouter_film.jsp").forward(req, resp);
        
        
    }

   
    
}
