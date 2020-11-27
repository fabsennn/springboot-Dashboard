package com.mit.Dashboard.kundenliste_pk;

import javax.persistence.*;

@Entity
@Table(name= "KUNDENLISTE_PK")
public class kundenliste_pk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name= "VERBUNDFUEHRER")
    private int verbundführer;

    @Column(name= "ALTER")
    private String alter;

    @Column(name= "ANZAHL_ERWACHSENE")
    private int anz_erw;

    @Column(name= "ANZAHL_KINDER")
    private int anz_ki;

    @Column(name= "ANZAHL_GIRO")
    private int anz_giro;

    @Column(name= "BERATER")
    private String berater;

    @Column(name= "KUNDENTYP")
    private String kundentyp;

    @Column(name= "EINKOMMEN")
    private int einkommen;

    @Column(name= "SPARFAEHIGKEIT")
    private int sparfähigkeit;

    @Column(name= "ERTRAG")
    private int ertrag;

    @Column(name= "AUSLEIHUNGEN")
    private int ausleihungen;

    @Column(name= "GESAMTEINLAGEN")
    private int gesamteinl;

    @Column(name= "WERTPAPIERE")
    private int wertpapiere;

    @Column(name= "DAVON_DEKA")
    private int davon_deka;

    @Column(name= "BS_SUMME")
    private int bs_summe;

    @Column(name= "BS_GUTHABEN")
    private int bs_guthaben;

    @Column(name= "RKW_LV")
    private int rkw_lv;

    @Column(name= "KRANKENVERSICHERUNG")
    private int krankenvers;

    @Column(name= "UNFALLVERSICHERUNG")
    private int unfallvers;

    @Column(name= "SACHVERSICHERUNG")
    private int sachvers;

    @Column(name= "SPARLEISTUNG")
    private int sparleistung;

    @Column(name= "FREISTELLUNG")
    private int freistellung;

    @Column(name= "GESAMTRANG")
    private int gesamtrang;

    @Column(name= "WP_RANG")
    private Integer wp_rang;

    @Column(name= "BS_RANG")
    private int bs_rang;

    @Column(name= "LV_RANG")
    private int lv_rang;

    @Column(name ="SOLLKONTAKTE")
    private int sollkontakte;

    @Column(name= "ISTKONTAKTE")
    private int istkontakte;

    @Column(name= "OFFEN")
    private int offen;

    @Column(name= "LETZTER_KONTAKT")
    private String letzter_kontakt;

    @Column(name= "DURCHDRUNGEN_BIS")
    private String durchdrungen_bis;

    @Column(name= "LETZTES_FIKO")
    private String letztes_fiko;

    public kundenliste_pk(){}

    public void setVerbundführer(int verbundführer) {
        this.verbundführer = verbundführer;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }

    public void setAnz_erw(int anz_erw) {
        this.anz_erw = anz_erw;
    }

    public void setAnz_ki(int anz_ki) {
        this.anz_ki = anz_ki;
    }

    public void setAnz_giro(int anz_giro) {
        this.anz_giro = anz_giro;
    }

    public void setBerater(String berater) {
        this.berater = berater;
    }

    public void setKundentyp(String kundentyp) {
        this.kundentyp = kundentyp;
    }

    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }

    public void setSparfähigkeit(int sparfähigkeit) {
        this.sparfähigkeit = sparfähigkeit;
    }

    public void setErtrag(int ertrag) {
        this.ertrag = ertrag;
    }

    public void setAusleihungen(int ausleihungen) {
        this.ausleihungen = ausleihungen;
    }

    public void setGesamteinl(int gesamteinl) {
        this.gesamteinl = gesamteinl;
    }

    public void setWertpapiere(int wertpapiere) {
        this.wertpapiere = wertpapiere;
    }

    public void setDavon_deka(int davon_deka) {
        this.davon_deka = davon_deka;
    }

    public void setBs_summe(int bs_summe) {
        this.bs_summe = bs_summe;
    }

    public void setBs_guthaben(int bs_guthaben) {
        this.bs_guthaben = bs_guthaben;
    }

    public void setRkw_lv(int rkw_lv) {
        this.rkw_lv = rkw_lv;
    }

    public void setKrankenvers(int krankenvers) {
        this.krankenvers = krankenvers;
    }

    public void setUnfallvers(int unfallvers) {
        this.unfallvers = unfallvers;
    }

    public void setSachvers(int sachvers) {
        this.sachvers = sachvers;
    }

    public void setSparleistung(int sparleistung) {
        this.sparleistung = sparleistung;
    }

    public void setFreistellung(int freistellung) {
        this.freistellung = freistellung;
    }

    public void setGesamtrang(int gesamtrang) {
        this.gesamtrang = gesamtrang;
    }

    public void setWp_rang(Integer wp_rang) {
        this.wp_rang = wp_rang;
    }

    public void setBs_rang(int bs_rang) {
        this.bs_rang = bs_rang;
    }

    public void setLv_rang(int lv_rang) {
        this.lv_rang = lv_rang;
    }

    public void setSollkontakte(int sollkontakte) {
        this.sollkontakte = sollkontakte;
    }

    public void setIstkontakte(int istkontakte) {
        this.istkontakte = istkontakte;
    }

    public void setOffen(int offen) {
        this.offen = offen;
    }

    public void setLetzter_kontakt(String letzter_kontakt) {
        this.letzter_kontakt = letzter_kontakt;
    }

    public void setDurchdrungen_bis(String durchdrungen_bis) {
        this.durchdrungen_bis = durchdrungen_bis;
    }

    public void setLetztes_fiko(String letztes_fiko) {
        this.letztes_fiko = letztes_fiko;
    }

    public int getVerbundführer() {
        return verbundführer;
    }

    public String getAlter() {
        return alter;
    }

    public int getAnz_erw() {
        return anz_erw;
    }

    public int getAnz_ki() {
        return anz_ki;
    }

    public int getAnz_giro() {
        return anz_giro;
    }

    public String getBerater() {
        return berater;
    }

    public String getKundentyp() {
        return kundentyp;
    }

    public int getEinkommen() {
        return einkommen;
    }

    public int getSparfähigkeit() {
        return sparfähigkeit;
    }

    public int getErtrag() {
        return ertrag;
    }

    public int getAusleihungen() {
        return ausleihungen;
    }

    public int getGesamteinl() {
        return gesamteinl;
    }

    public int getWertpapiere() {
        return wertpapiere;
    }

    public int getDavon_deka() {
        return davon_deka;
    }

    public int getBs_summe() {
        return bs_summe;
    }

    public int getBs_guthaben() {
        return bs_guthaben;
    }

    public int getRkw_lv() {
        return rkw_lv;
    }

    public int getKrankenvers() {
        return krankenvers;
    }

    public int getUnfallvers() {
        return unfallvers;
    }

    public int getSachvers() {
        return sachvers;
    }

    public int getSparleistung() {
        return sparleistung;
    }

    public int getFreistellung() {
        return freistellung;
    }

    public int getGesamtrang() {
        return gesamtrang;
    }

    public Integer getWp_rang() {
        return wp_rang;
    }

    public int getBs_rang() {
        return bs_rang;
    }

    public int getLv_rang() {
        return lv_rang;
    }

    public int getSollkontakte() {
        return sollkontakte;
    }

    public int getIstkontakte() {
        return istkontakte;
    }

    public int getOffen() {
        return offen;
    }

    public String getLetzter_kontakt() {
        return letzter_kontakt;
    }

    public String getDurchdrungen_bis() {
        return durchdrungen_bis;
    }

    public String getLetztes_fiko() {
        return letztes_fiko;
    }

    @Override
    public String toString()
    {
        return "Privatkunde [Verbundführer=" + verbundführer + ", Berater=" + berater + ", Krankenvers.="
                + krankenvers + ", Unfallvers.=" + unfallvers + ", Sachvers." + sachvers + ", WP-Rang="
                + wp_rang + ", BS-Rang=" + bs_rang + ", LV-Rang=" + lv_rang + "]";
    }
}
