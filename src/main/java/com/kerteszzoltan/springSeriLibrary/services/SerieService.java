package com.kerteszzoltan.springSeriLibrary.services;

import com.kerteszzoltan.springSeriLibrary.models.Serie;
import com.kerteszzoltan.springSeriLibrary.repositories.ISerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {
    private final ISerieRepository serieRepository;

    @Autowired
    public SerieService(ISerieRepository serieRepository){
        this.serieRepository = serieRepository;
    }

    public List<Serie> getSeries(){
        return serieRepository.findAll();
    }
}
