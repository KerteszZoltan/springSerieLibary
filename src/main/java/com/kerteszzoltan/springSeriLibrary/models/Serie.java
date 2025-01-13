package com.kerteszzoltan.springSeriLibrary.models;

import jakarta.persistence.*;
import org.w3c.dom.Text;

@Entity
@Table(name = "`Series`")
public class Serie {

    @Id
    @SequenceGenerator(name = "serieSequence",
    sequenceName = "serieSequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "serieSequence")
    private long id;
    private String titleEN;
    private String titleHU;
    @Column(columnDefinition = "TEXT")
    private String descriptionEN;
    @Column(columnDefinition = "TEXT")
    private String descriptionHU;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitleEN() {
        return titleEN;
    }

    public void setTitleEN(String titleEN) {
        this.titleEN = titleEN;
    }

    public String getTitleHU() {
        return titleHU;
    }

    public void setTitleHU(String titleHU) {
        this.titleHU = titleHU;
    }

    public String getDescriptionEN() {
        return descriptionEN;
    }

    public void setDescriptionEN(String descriptionEN) {
        this.descriptionEN = descriptionEN;
    }

    public String getDescriptionHU() {
        return descriptionHU;
    }

    public void setDescriptionHU(String descriptionHU) {
        this.descriptionHU = descriptionHU;
    }

    public Serie() {
    }

    public Serie(String titleEN, String titleHU, String descriptionEN, String descriptionHU) {
        this.titleEN = titleEN;
        this.titleHU = titleHU;
        this.descriptionEN = descriptionEN;
        this.descriptionHU = descriptionHU;
    }

    public Serie(long id, String titleEN, String titleHU, String descriptionEN, String descriptionHU) {
        this.id = id;
        this.titleEN = titleEN;
        this.titleHU = titleHU;
        this.descriptionEN = descriptionEN;
        this.descriptionHU = descriptionHU;
    }


}
