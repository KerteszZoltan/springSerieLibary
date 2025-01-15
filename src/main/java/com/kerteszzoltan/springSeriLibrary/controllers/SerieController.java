package com.kerteszzoltan.springSeriLibrary.controllers;

import com.kerteszzoltan.springSeriLibrary.models.Serie;
import com.kerteszzoltan.springSeriLibrary.services.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/serie")
public class SerieController {

    private final SerieService serieService;

    @Autowired
    public SerieController(SerieService serieService){
        this.serieService = serieService;
    }

    @GetMapping
    public List<Serie> getSeries(){
        return serieService.getSeries();
    }

    @GetMapping(path = "{serieId}")
    public Optional<Serie> getOneSerie(@PathVariable ("serieId") Long serieId){
        return serieService.getOneSerie(serieId);
    }

    @DeleteMapping(path = "{serieId}")
    public Optional<Serie> deleteSerieById(@PathVariable("serieId") Long serieId){
        return serieService.deleteSerieById(serieId);
    }

    @PatchMapping(path = "{serieId}")
    public Optional<Serie> updateSerieById(@PathVariable("serieId") Long serieId,
                                           @RequestBody Serie serie){
        return serieService.updateSerie(serieId,serie);
    }

    @PostMapping
    public Optional<Serie> addSerie(@RequestBody Serie serie){
        return serieService.addSerie(serie);
    }
}
