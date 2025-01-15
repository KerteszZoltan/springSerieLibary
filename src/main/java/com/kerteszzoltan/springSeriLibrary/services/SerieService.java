package com.kerteszzoltan.springSeriLibrary.services;

import com.kerteszzoltan.springSeriLibrary.controllers.SerieController;
import com.kerteszzoltan.springSeriLibrary.models.Serie;
import com.kerteszzoltan.springSeriLibrary.repositories.ISerieRepository;
import jakarta.transaction.Transactional;
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

    public Optional<Serie> addSerie(Serie serie){
        Optional<Serie> existSerie = serieRepository.findByTitleEN(serie.getTitleEN());
        return Optional.of(serieRepository.save(serie));
    }

    public Optional<Serie> deleteSerieById(Long serieId){
        Optional<Serie> deletedSerie = serieRepository.findById(serieId);
        if (deletedSerie.isEmpty()){
            throw new IllegalStateException("Invalid serie ID");
        }
        serieRepository.deleteById(serieId);
        return deletedSerie;
    }

    @Transactional
    public Optional<Serie> updateSerie(Long serieId, Serie serie){
        Serie tempSerie = serieRepository.findById(serieId).orElseThrow(
                ()->new IllegalStateException("This id:" +serieId+"is invalid."));
        if(serie.getTitleEN() != null && !serie.getTitleEN().equals(tempSerie.getTitleEN())){
            tempSerie.setTitleEN(serie.getTitleEN());
        }
        if(serie.getTitleHU()!= null){
            tempSerie.setTitleHU(serie.getTitleHU());
        }
        if(serie.getDescriptionEN()!= null){
            tempSerie.setDescriptionEN(serie.getDescriptionEN());
        }
        if(serie.getDescriptionHU()!= null){
            tempSerie.setDescriptionHU(serie.getDescriptionHU());
        }
        serieRepository.save(tempSerie);
        return Optional.of(tempSerie);
    }
}
