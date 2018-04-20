/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.service;

import StreamingWeb.entity.Serie;
import java.util.List;

/**
 *
 * @author Formation
 */
public interface SeriesService {
    public Serie rechercheParId(long id);
    public List<Serie> listerSeries();

    public Long compterNbEpisode(long id);
}
