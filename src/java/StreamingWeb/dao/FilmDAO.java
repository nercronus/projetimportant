/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.dao;

import StreamingWeb.Servlet.FilmsServlet;
import StreamingWeb.entity.Film;
import java.util.List;

/**
 *
 * @author Formation
 */
public interface FilmDAO {
    public void ajouterFilm(Film f);
    public Film trouveDetailFilm(Long id);
    public List<Film> lister();
}
