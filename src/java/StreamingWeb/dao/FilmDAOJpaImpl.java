/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.dao;

import StreamingWeb.entity.Film;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Formation
 */
public class FilmDAOJpaImpl  implements FilmDAO{

    @Override
    public List<Film> lister() {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("select f from Film f");
        
        return query.getResultList();
            
        }

    @Override
    public Film trouveDetailFilm(Long id)
    {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.find(Film.class, id);
        
    }

    @Override
    public void ajouterFilm(Film f) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }
}
