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
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Formation
 */
@WebServlet(name = "FilmsServlet", urlPatterns = {"/lister_films"})
public class FilmsServlet extends HttpServlet {
    
    private FilmService service = new FilmServiceJpaImpl();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        List<Film> films = service.listerFilms();
        
        req.setAttribute("listedesFilms", films);
        
        req.getRequestDispatcher("films.jsp").forward(req, resp);
        
    }
    
}
