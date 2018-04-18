/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.Servlet;

import StreamingWeb.entity.Serie;
import StreamingWeb.service.SeriesService;
import StreamingWeb.service.SeriesServiceJpaImpl;
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
@WebServlet(name = "SeriesServlet", urlPatterns = {"/Series"})
public class SeriesServlet extends HttpServlet {

    private SeriesService service = new SeriesServiceJpaImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        List<Serie> series = service.listerSeries();
        
        req.setAttribute("listedesSeries", series);
        
        req.getRequestDispatcher("series.jsp").forward(req, resp);
    }
    
}
