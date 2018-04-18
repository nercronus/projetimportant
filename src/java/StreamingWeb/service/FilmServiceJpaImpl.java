/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.service;

import StreamingWeb.dao.FilmDAO;
import StreamingWeb.dao.FilmDAOJpaImpl;
import StreamingWeb.entity.Film;
import java.util.List;

/**
 *
 * @author Formation
 */
public class FilmServiceJpaImpl implements FilmService{
    
    private FilmDAO dao = new FilmDAOJpaImpl();
    
    @Override
    public List<Film> listerFilms() {
        
        return dao.lister();
    }

    @Override
    public Film rechercheParId(Long id) {
        
        return dao.trouveDetailFilm(id);
    }
    
}
