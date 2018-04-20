/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.service;

import StreamingWeb.dao.GenreDAO;
import StreamingWeb.dao.GenreDAOJpaImpl;
import StreamingWeb.entity.Genre;
import java.util.List;

/**
 *
 * @author Formation
 */
public class GenreServiceJpaImpl implements GenreService{
    
    private GenreDAO dao = new GenreDAOJpaImpl();
    
    @Override
    public List<Genre> listerGenres() {
        
        return dao.listerGenres();
    }
    
}
