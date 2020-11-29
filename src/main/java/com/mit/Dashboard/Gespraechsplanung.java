package com.mit.Dashboard;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GESPRAECHSPLANUNG")
public class Gespraechsplanung {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "KUNDENNUMMER")
    private int kundennummer;

    @Column(name = "KATEGORIE")
    private String kategorie;

    @Column(name = "THEMA")
    private String thema;

    @Column(name = "DATUM")
    private String datum;

    @Column(name = "ZEITRAUM")
    private String zeitraum;

    @Column(name = "BERATER")
    private String berater;

    @Column(name = "NAECHSTE_FAELLIGKEIT")
    private String  naechsteFaelligkeit;

    @Column(name = "LETZTER_KONTAKT")
    private String  letzterKontakt;

    //Datum, Zeitraum, Berater, nächsteFälligkeit, letzterkontakt
    public Gespraechsplanung() {
    }

    /*public Gespraechsplanung(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getZeitraum() {
        return zeitraum;
    }

    public void setZeitraum(String zeitraum) {
        this.zeitraum = zeitraum;
    }

    public String getBerater() {
        return berater;
    }

    public void setBerater(String berater) {
        this.berater = berater;
    }

    public String getNaechsteFaelligkeit() {
        return naechsteFaelligkeit;
    }

    public void setNaechsteFaelligkeit(String naechsteFaelligkeit) {
        this.naechsteFaelligkeit = naechsteFaelligkeit;
    }

    public String getLetzterKontakt() {
        return letzterKontakt;
    }

    public void setLetzterKontakt(String letzterKontakt) {
        this.letzterKontakt = letzterKontakt;
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    @Override
    public String toString() {
        return "Gespraech [id=" + id + ", Kategorie=" + kategorie + ",Kundennummer=" + kundennummer + ", Thema=" + thema + ", Nächste Fälligkeit=" + naechsteFaelligkeit + "]";
    }
}
