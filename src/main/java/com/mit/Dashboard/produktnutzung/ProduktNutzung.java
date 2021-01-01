package com.mit.Dashboard.produktnutzung;

import javax.persistence.*;

@Entity
@Table(name = "PRODUKTNUTZUNG")
public class ProduktNutzung {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "MERKMAL")
    private String merkmal;

    @Column(name = "VERBUENDE")
    private String verbuende;

    @Column(name = "KRANKENVERSICHERUNG")
    private String krankenVersicherung;

    @Column(name = "SACHVERSICHERUNG")
    private String sachVersicherung;

    @Column(name = "KFZ-Versicherung")
    private String kfzVersicherung;

    @Column(name = "Unfall-Versicherung")
    private String unfallVersicherung;


    public ProduktNutzung() { //leer
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMerkmal() {
        return merkmal;
    }

    public void setMerkmal(String merkmal) {
        this.merkmal = merkmal;
    }

    public String getVerbuende() {
        return verbuende;
    }

    public void setVerbuende(String verbuende) {
        this.verbuende = verbuende;
    }

    public String getKrankenVersicherung() {
        return krankenVersicherung;
    }

    public void setKrankenVersicherung(String krankenVersicherung) {
        this.krankenVersicherung = krankenVersicherung;
    }

    public String getSachVersicherung() {
        return sachVersicherung;
    }

    public void setSachVersicherung(String sachVersicherung) {
        this.sachVersicherung = sachVersicherung;
    }

    public String getKfzVersicherung() {
        return kfzVersicherung;
    }

    public void setKfzVersicherung(String kfzVersicherung) {
        this.kfzVersicherung = kfzVersicherung;
    }

    public String getUnfallVersicherung() {
        return unfallVersicherung;
    }

    public void setUnfallVersicherung(String unfallVersicherung) {
        this.unfallVersicherung = unfallVersicherung;
    }

    @Override
    public String toString() {
        return "ProduktNutzung{" +
                "merkmal='" + merkmal + '\'' +
                ", verbuende='" + verbuende + '\'' +
                ", krankenVersicherung='" + krankenVersicherung + '\'' +
                ", sachVersicherung='" + sachVersicherung + '\'' +
                ", kfzVersicherung='" + kfzVersicherung + '\'' +
                ", unfallVersicherung='" + unfallVersicherung + '\'' +
                '}';
    }
}
