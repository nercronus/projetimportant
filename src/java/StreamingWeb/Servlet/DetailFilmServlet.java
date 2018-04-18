/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.Servlet;

import StreamingWeb.entity.Film;
import StreamingWeb.service.FilmService;
import StreamingWeb.service.FilmServiceJpaImpl;
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
@WebServlet(name = "DetailFilmServlet", urlPatterns = {"/detail_film"})
public class DetailFilmServlet extends HttpServlet {
    
    private FilmService service = new FilmServiceJpaImpl();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         String idString = req.getParameter("idFilm");
         
         Film film = service.rechercheParId(Long.parseLong(idString));
         
         req.setAttribute("film", film);
         
         req.getRequestDispatcher("detail_film.jsp").forward(req, resp);
    }

}
