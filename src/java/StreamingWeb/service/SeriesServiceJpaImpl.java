/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.service;

import StreamingWeb.dao.SerieDAOJpaImpl;
import StreamingWeb.dao.SeriesDao;
import StreamingWeb.entity.Serie;
import java.util.List;

/**
 *
 * @author Formation
 */
public class SeriesServiceJpaImpl implements SeriesService{
    
    private SeriesDao dao = new SerieDAOJpaImpl();
    
    @Override
    public List<Serie> listerSeries() {
        
        return dao.lister();
    }
    
}
