package com.kerteszzoltan.springSeriLibrary.configs;

import com.kerteszzoltan.springSeriLibrary.models.Serie;
import com.kerteszzoltan.springSeriLibrary.repositories.ISerieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SerieConfig {

    @Bean
    CommandLineRunner commandLineRunnerSerie(ISerieRepository serieRepository){
        return args -> {
            Serie teszt = new Serie("tesztentitle",
                    "teszthuntitle",
                    "tesztdiscriptionen",
                    "tesztdiscriptionhu");
            serieRepository.save(teszt);
        };
    }
}
