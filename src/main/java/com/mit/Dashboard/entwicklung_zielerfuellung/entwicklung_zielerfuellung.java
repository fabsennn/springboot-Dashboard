package com.mit.Dashboard.entwicklung_zielerfuellung;

import javax.persistence.*;

@Entity
@Table (name= "ENTWICKLUNG_ZIELERFUELLUNG")
public class entwicklung_zielerfuellung {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name= "MARKTBEREICH")
    private String marktbereich;

    @Column(name= "MERKMAL")
    private String merkmal;

    @Column(name= "STICHTAG")
    private String stichtag;

    @Column(name= "BESTAND_STICHTAG")
    private double bestand_stichtag;

    @Column(name= "JAHRESABSATZ/-ZUWACHS")
    private double jahresabsatz_zuwachs;

    @Column(name= "JAHRESZIEL")
    private double jahresziel;

    @Column(name= "WERT_AKTUELLER_ZEITRAUM")
    private double wert_aktueller_zeitraum;

    @Column(name= "ZIELERREICHUNG_ZEITANTEIL")
    private double zielerreichung_zeitanteil;

    @Column(name= "ZIELERREICHUNG_JAHR")
    private double zielerreichung_jahr;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarktbereich() {
        return marktbereich;
    }

    public void setMarktbereich(String marktbereich) {
        this.marktbereich = marktbereich;
    }

    public String getMerkmal() {
        return merkmal;
    }

    public void setMerkmal(String merkmal) {
        this.merkmal = merkmal;
    }

    public String getStichtag() {
        return stichtag;
    }

    public void setStichtag(String stichtag) {
        this.stichtag = stichtag;
    }

    public double getBestand_stichtag() {
        return bestand_stichtag;
    }

    public void setBestand_stichtag(double bestand_stichtag) {
        this.bestand_stichtag = bestand_stichtag;
    }

    public double getJahresabsatz_zuwachs() {
        return jahresabsatz_zuwachs;
    }

    public void setJahresabsatz_zuwachs(double jahresabsatz_zuwachs) {
        this.jahresabsatz_zuwachs = jahresabsatz_zuwachs;
    }

    public double getJahresziel() {
        return jahresziel;
    }

    public void setJahresziel(double jahresziel) {
        this.jahresziel = jahresziel;
    }

    public double getWert_aktueller_zeitraum() {
        return wert_aktueller_zeitraum;
    }

    public void setWert_aktueller_zeitraum(double wert_aktueller_zeitraum) {
        this.wert_aktueller_zeitraum = wert_aktueller_zeitraum;
    }

    public double getZielerreichung_zeitanteil() {
        return zielerreichung_zeitanteil;
    }

    public void setZielerreichung_zeitanteil(double zielerreichung_zeitanteil) {
        this.zielerreichung_zeitanteil = zielerreichung_zeitanteil;
    }

    public double getZielerreichung_jahr() {
        return zielerreichung_jahr;
    }

    public void setZielerreichung_jahr(double zielerreichung_jahr) {
        this.zielerreichung_jahr = zielerreichung_jahr;
    }
}
