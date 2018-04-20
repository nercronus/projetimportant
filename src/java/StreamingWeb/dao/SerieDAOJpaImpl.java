/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.dao;

import StreamingWeb.entity.Serie;
import StreamingWeb.service.SeriesService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Formation
 */
public class SerieDAOJpaImpl implements SeriesDao{
    
    @Override
    public List<Serie> lister() {
        
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query query = em.createQuery("select s from Serie s");
        return query.getResultList();
    
    }

    @Override
    public Serie trouveDetailSeries(Long id) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.find(Serie.class, id);
    }

    @Override
    public long compterNbEpisodes(long idSerie) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("select count (e) from Episode e join e.saison s join s.serie se where se.id="+idSerie);
        
         return (long) query.getSingleResult();
    }
}
