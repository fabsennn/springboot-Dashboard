package com.mit.Dashboard.newscard;


import javax.persistence.*;
import java.io.File;

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

    @Lob
    @Column(name="DATEI", columnDefinition = "Blob")
    private File datei;

    public newscard() {

    }

    public newscard(String neuigkeit, String berater, String dringlichkeit, String datum, File datei) {
        this.neuigkeit = neuigkeit;
        this.berater = berater;
        this.dringlichkeit = dringlichkeit;
        this.datum = datum;
        this.datei = datei;
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

    public void setDatei(File datei) {
        this.datei = datei;
    }

    public File getDatei() {
        return datei;
    }
}
