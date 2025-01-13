package com.kerteszzoltan.springSeriLibrary.controllers;

import com.kerteszzoltan.springSeriLibrary.models.Serie;
import com.kerteszzoltan.springSeriLibrary.services.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
