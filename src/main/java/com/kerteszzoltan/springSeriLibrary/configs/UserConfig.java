package com.kerteszzoltan.springSeriLibrary.configs;

import com.kerteszzoltan.springSeriLibrary.models.User;
import com.kerteszzoltan.springSeriLibrary.repositories.IUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(IUserRepository userRepository){
        return args -> {
            User teszt = new User("teszt", "teszt@teszt.hu", "teszt");
            userRepository.save(teszt);
        };

    }
}
