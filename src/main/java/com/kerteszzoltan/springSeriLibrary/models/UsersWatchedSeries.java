package com.kerteszzoltan.springSeriLibrary.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "`UsersWatchedSeries`")
public class UsersWatchedSeries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "serieid")
    private Serie serie;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    @Column
    private LocalDate watchedAt;

    public UsersWatchedSeries(long id, long teszt1Id, LocalDate now) {
    }

    public UsersWatchedSeries(Serie serie, User user, LocalDate watchedAt) {
        this.serie = serie;
        this.user = user;
        this.watchedAt = watchedAt;
    }

    public UsersWatchedSeries(Long id, Serie serie, User user, LocalDate watchedAt) {
        this.id = id;
        this.serie = serie;
        this.user = user;
        this.watchedAt = watchedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getWatchedAt() {
        return watchedAt;
    }

    public void setWatchedAt(LocalDate watchedAt) {
        this.watchedAt = watchedAt;
    }
}
