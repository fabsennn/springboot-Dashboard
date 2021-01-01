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
    private int verbuende;

    @Column(name = "KRANKENVERSICHERUNG")
    private int krankenVersicherung;

    @Column(name = "SACHVERSICHERUNG")
    private int sachVersicherung;

    @Column(name = "KFZVERSICHERUNG")
    private int kfzVersicherung;

    @Column(name = "UNFALLVERSICHERUNG")
    private int unfallVersicherung;


    public ProduktNutzung() {
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

    public int getVerbuende() {
        return verbuende;
    }

    public void setVerbuende(int verbuende) {
        this.verbuende = verbuende;
    }

    public int getKrankenVersicherung() {
        return krankenVersicherung;
    }

    public void setKrankenVersicherung(int krankenVersicherung) {
        this.krankenVersicherung = krankenVersicherung;
    }

    public int getSachVersicherung() {
        return sachVersicherung;
    }

    public void setSachVersicherung(int sachVersicherung) {
        this.sachVersicherung = sachVersicherung;
    }

    public int getKfzVersicherung() {
        return kfzVersicherung;
    }

    public void setKfzVersicherung(int kfzVersicherung) {
        this.kfzVersicherung = kfzVersicherung;
    }

    public int getUnfallVersicherung() {
        return unfallVersicherung;
    }

    public void setUnfallVersicherung(int unfallVersicherung) {
        this.unfallVersicherung = unfallVersicherung;
    }
}
