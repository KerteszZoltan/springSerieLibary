package com.kerteszzoltan.springSeriLibrary.repositories;

import com.kerteszzoltan.springSeriLibrary.models.UsersWatchedSeries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersWatchedSeries extends JpaRepository<UsersWatchedSeries, Long> {
}
