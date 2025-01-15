package com.kerteszzoltan.springSeriLibrary.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "`UsersWatchedSeries`")
public class UsersWatchedSeries {

    @Id
    @SequenceGenerator(
            name = "usersWatchedSeriesSequence",
            sequenceName = "usersWatchedSeriesSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "usersWatchedSeriesSequence"
    )
    private Long id;
    @Column
    private Long userid;
    @Column
    private Long serieid;
    @Column
    private LocalDate watchedAt;

    public UsersWatchedSeries() {
    }

    public UsersWatchedSeries(Long userid, Long serieid, LocalDate watchedAt) {
        this.userid = userid;
        this.serieid = serieid;
        this.watchedAt = watchedAt;
    }

    public UsersWatchedSeries(Long id, Long userid, Long serieid, LocalDate watchedAt) {
        this.id = id;
        this.userid = userid;
        this.serieid = serieid;
        this.watchedAt = watchedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getSerieid() {
        return serieid;
    }

    public void setSerieid(Long serieid) {
        this.serieid = serieid;
    }

    public LocalDate getWatchedAt() {
        return watchedAt;
    }

    public void setWatchedAt(LocalDate watchedAt) {
        this.watchedAt = watchedAt;
    }
}
