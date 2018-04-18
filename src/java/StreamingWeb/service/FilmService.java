/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamingWeb.service;

import StreamingWeb.entity.Film;
import java.util.List;

/**
 *
 * @author Formation
 */
public interface FilmService {
    public Film rechercheParId(Long id);
    public List<Film> listerFilms();
}
