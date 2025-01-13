package com.kerteszzoltan.springSeriLibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kerteszzoltan.springSeriLibrary.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.email=?1")
    Optional<User> findUserByEmail(String email);

}
