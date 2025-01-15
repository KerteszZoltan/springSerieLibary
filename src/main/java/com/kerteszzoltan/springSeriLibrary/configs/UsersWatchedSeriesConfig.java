package com.kerteszzoltan.springSeriLibrary.configs;

import com.kerteszzoltan.springSeriLibrary.models.Serie;
import com.kerteszzoltan.springSeriLibrary.models.User;
import com.kerteszzoltan.springSeriLibrary.models.UsersWatchedSeries;
import com.kerteszzoltan.springSeriLibrary.repositories.ISerieRepository;
import com.kerteszzoltan.springSeriLibrary.repositories.IUserRepository;
import com.kerteszzoltan.springSeriLibrary.repositories.IUsersWatchedSeries;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Optional;

/*@Configuration
public class UsersWatchedSeriesConfig {

    @Bean
    CommandLineRunner commandLineRunnerUsersWatchedSeries(IUsersWatchedSeries usersWatchedSeries, IUserRepository userRepository, ISerieRepository serieRepository){
        return args -> {
            Optional<User> tesztUser = userRepository.findById(1L);
            Optional<Serie> tesztSerie = serieRepository.findById(1L);
            UsersWatchedSeries tesztk = new UsersWatchedSeries(tesztSerie.get().getId(), tesztUser.get().getId(), LocalDate.now());
        };
    }

}*/
