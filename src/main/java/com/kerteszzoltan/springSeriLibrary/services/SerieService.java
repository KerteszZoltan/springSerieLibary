package com.kerteszzoltan.springSeriLibrary.services;

import com.kerteszzoltan.springSeriLibrary.models.Serie;
import com.kerteszzoltan.springSeriLibrary.repositories.ISerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

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

    public Optional<Serie> getOneSerie(Long serieId){
        if (serieRepository.findById(serieId).isEmpty()){
           throw new IllegalStateException("Invalid serie ID");
        }
        return serieRepository.findById(serieId);
    }
}
