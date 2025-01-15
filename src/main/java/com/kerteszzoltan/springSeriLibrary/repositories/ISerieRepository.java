package com.kerteszzoltan.springSeriLibrary.repositories;

import com.kerteszzoltan.springSeriLibrary.models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ISerieRepository extends JpaRepository<Serie, Long> {
    Optional<Serie> findByTitleEN(String titleen);
}
