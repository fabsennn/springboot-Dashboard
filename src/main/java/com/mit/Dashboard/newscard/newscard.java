package com.mit.Dashboard.newscard;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;

@Entity
@Table(name= "NEWSCARD")
public class newscard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "NEUIGKEIT")
    private String neuigkeit;

    @Column(name = "BERATER")
    private String berater;

    @Column(name = "DRINGLICHKEIT")
    private String dringlichkeit;

    @Column(name = "DATUM")
    private String datum;

    public newscard() {

    }

    public newscard(String neuigkeit, String berater, String dringlichkeit, String datum) {
        this.neuigkeit = neuigkeit;
        this.berater = berater;
        this.dringlichkeit = dringlichkeit;
        this.datum = datum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNeuigkeit() {
        return neuigkeit;
    }

    public void setNeuigkeit(String neuigkeit) {
        this.neuigkeit = neuigkeit;
    }

    public String getBerater() {
        return berater;
    }

    public void setBerater(String berater) {
        this.berater = berater;
    }

    public String getDringlichkeit() {
        return dringlichkeit;
    }

    public void setDringlichkeit(String dringlichkeit) {
        this.dringlichkeit = dringlichkeit;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
}
