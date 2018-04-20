/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.dao;

import StreamingWeb.entity.Genre;
import java.util.List;

/**
 *
 * @author Formation
 */
public interface GenreDAO {
    
    public List<Genre> listerGenres();
    
    
}
