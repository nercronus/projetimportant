/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.dao;

import StreamingWeb.entity.Serie;
import java.util.List;
import javafx.scene.chart.XYChart;

/**
 *
 * @author Formation
 */
public interface SeriesDao {
    public List<Serie> lister();
}
