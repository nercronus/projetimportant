/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.dao;

import StreamingWeb.entity.Genre;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Formation
 */
public class GenreDAOJpaImpl implements GenreDAO{

    @Override
    public List<Genre> listerGenres() {
       
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("select g from Genre g ORDER BY g.nom");
        
        return query.getResultList();
    }
    
    
}
