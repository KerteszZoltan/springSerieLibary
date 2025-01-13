package com.kerteszzoltan.springSeriLibrary.repositories;

import com.kerteszzoltan.springSeriLibrary.models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISerieRepository extends JpaRepository<Serie, Long> {
}
