package com.mit.Dashboard.kundenliste_pk;

import javax.persistence.*;

@Entity
@Table(name= "KUNDENLISTE_PK")
public class kundenliste_pk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name= "VERBUNDFUEHRER")
    private Integer verbundführer;

    @Column(name= "NACHNAME")
    private String nachname;

    @Column(name= "ALTER")
    private String alter;

    @Column(name= "ANZAHL_ERWACHSENE")
    private Integer anz_erw;

    @Column(name= "ANZAHL_KINDER")
    private Integer anz_ki;

    @Column(name= "ANZAHL_GIRO")
    private Integer anz_giro;

    @Column(name= "BERATER")
    private String berater;

    @Column(name= "KUNDENTYP")
    private String kundentyp;

    @Column(name= "EINKOMMEN")
    private Integer einkommen;

    @Column(name= "SPARFAEHIGKEIT")
    private Integer sparfähigkeit;

    @Column(name= "ERTRAG")
    private Integer ertrag;

    @Column(name= "AUSLEIHUNGEN")
    private Integer ausleihungen;

    @Column(name= "GESAMTEINLAGEN")
    private Integer gesamteinl;

    @Column(name= "WERTPAPIERE")
    private Integer wertpapiere;

    @Column(name= "DAVON_DEKA")
    private Integer davon_deka;

    @Column(name= "BS_SUMME")
    private Integer bs_summe;

    @Column(name= "BS_GUTHABEN")
    private Integer bs_guthaben;

    @Column(name= "RKW_LV")
    private Integer rkw_lv;

    @Column(name= "KRANKENVERSICHERUNG")
    private Integer krankenvers;

    @Column(name= "UNFALLVERSICHERUNG")
    private Integer unfallvers;

    @Column(name= "SACHVERSICHERUNG")
    private Integer sachvers;

    @Column(name= "SPARLEISTUNG")
    private Integer sparleistung;

    @Column(name= "FREISTELLUNG")
    private Integer freistellung;

    @Column(name= "GESAMTRANG")
    private Integer gesamtrang;

    @Column(name= "WP_RANG")
    private Integer wp_rang;

    @Column(name= "BS_RANG")
    private Integer bs_rang;

    @Column(name= "LV_RANG")
    private Integer lv_rang;

    @Column(name ="SOLLKONTAKTE")
    private Integer sollkontakte;

    @Column(name= "ISTKONTAKTE")
    private Integer istkontakte;

    @Column(name= "OFFEN")
    private Integer offen;

    @Column(name= "LETZTER_KONTAKT")
    private String letzter_kontakt;

    @Column(name= "DURCHDRUNGEN_BIS")
    private String durchdrungen_bis;

    @Column(name= "LETZTES_FIKO")
    private String letztes_fiko;

    public kundenliste_pk(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getVerbundführer() {
        return verbundführer;
    }

    public void setVerbundführer(Integer verbundführer) {
        this.verbundführer = verbundführer;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }

    public Integer getAnz_erw() {
        return anz_erw;
    }

    public void setAnz_erw(Integer anz_erw) {
        this.anz_erw = anz_erw;
    }

    public Integer getAnz_ki() {
        return anz_ki;
    }

    public void setAnz_ki(Integer anz_ki) {
        this.anz_ki = anz_ki;
    }

    public Integer getAnz_giro() {
        return anz_giro;
    }

    public void setAnz_giro(Integer anz_giro) {
        this.anz_giro = anz_giro;
    }

    public String getBerater() {
        return berater;
    }

    public void setBerater(String berater) {
        this.berater = berater;
    }

    public String getKundentyp() {
        return kundentyp;
    }

    public void setKundentyp(String kundentyp) {
        this.kundentyp = kundentyp;
    }

    public Integer getEinkommen() {
        return einkommen;
    }

    public void setEinkommen(Integer einkommen) {
        this.einkommen = einkommen;
    }

    public Integer getSparfähigkeit() {
        return sparfähigkeit;
    }

    public void setSparfähigkeit(Integer sparfähigkeit) {
        this.sparfähigkeit = sparfähigkeit;
    }

    public Integer getErtrag() {
        return ertrag;
    }

    public void setErtrag(Integer ertrag) {
        this.ertrag = ertrag;
    }

    public Integer getAusleihungen() {
        return ausleihungen;
    }

    public void setAusleihungen(Integer ausleihungen) {
        this.ausleihungen = ausleihungen;
    }

    public Integer getGesamteinl() {
        return gesamteinl;
    }

    public void setGesamteinl(Integer gesamteinl) {
        this.gesamteinl = gesamteinl;
    }

    public Integer getWertpapiere() {
        return wertpapiere;
    }

    public void setWertpapiere(Integer wertpapiere) {
        this.wertpapiere = wertpapiere;
    }

    public Integer getDavon_deka() {
        return davon_deka;
    }

    public void setDavon_deka(Integer davon_deka) {
        this.davon_deka = davon_deka;
    }

    public Integer getBs_summe() {
        return bs_summe;
    }

    public void setBs_summe(Integer bs_summe) {
        this.bs_summe = bs_summe;
    }

    public Integer getBs_guthaben() {
        return bs_guthaben;
    }

    public void setBs_guthaben(Integer bs_guthaben) {
        this.bs_guthaben = bs_guthaben;
    }

    public Integer getRkw_lv() {
        return rkw_lv;
    }

    public void setRkw_lv(Integer rkw_lv) {
        this.rkw_lv = rkw_lv;
    }

    public Integer getKrankenvers() {
        return krankenvers;
    }

    public void setKrankenvers(Integer krankenvers) {
        this.krankenvers = krankenvers;
    }

    public Integer getUnfallvers() {
        return unfallvers;
    }

    public void setUnfallvers(Integer unfallvers) {
        this.unfallvers = unfallvers;
    }

    public Integer getSachvers() {
        return sachvers;
    }

    public void setSachvers(Integer sachvers) {
        this.sachvers = sachvers;
    }

    public Integer getSparleistung() {
        return sparleistung;
    }

    public void setSparleistung(Integer sparleistung) {
        this.sparleistung = sparleistung;
    }

    public Integer getFreistellung() {
        return freistellung;
    }

    public void setFreistellung(Integer freistellung) {
        this.freistellung = freistellung;
    }

    public Integer getGesamtrang() {
        return gesamtrang;
    }

    public void setGesamtrang(Integer gesamtrang) {
        this.gesamtrang = gesamtrang;
    }

    public Integer getWp_rang() {
        return wp_rang;
    }

    public void setWp_rang(Integer wp_rang) {
        this.wp_rang = wp_rang;
    }

    public Integer getBs_rang() {
        return bs_rang;
    }

    public void setBs_rang(Integer bs_rang) {
        this.bs_rang = bs_rang;
    }

    public Integer getLv_rang() {
        return lv_rang;
    }

    public void setLv_rang(Integer lv_rang) {
        this.lv_rang = lv_rang;
    }

    public Integer getSollkontakte() {
        return sollkontakte;
    }

    public void setSollkontakte(Integer sollkontakte) {
        this.sollkontakte = sollkontakte;
    }

    public Integer getIstkontakte() {
        return istkontakte;
    }

    public void setIstkontakte(Integer istkontakte) {
        this.istkontakte = istkontakte;
    }

    public Integer getOffen() {
        return offen;
    }

    public void setOffen(Integer offen) {
        this.offen = offen;
    }

    public String getLetzter_kontakt() {
        return letzter_kontakt;
    }

    public void setLetzter_kontakt(String letzter_kontakt) {
        this.letzter_kontakt = letzter_kontakt;
    }

    public String getDurchdrungen_bis() {
        return durchdrungen_bis;
    }

    public void setDurchdrungen_bis(String durchdrungen_bis) {
        this.durchdrungen_bis = durchdrungen_bis;
    }

    public String getLetztes_fiko() {
        return letztes_fiko;
    }

    public void setLetztes_fiko(String letztes_fiko) {
        this.letztes_fiko = letztes_fiko;
    }

    @Override
    public String toString()
    {
        return "Privatkunde [Verbundführer=" + verbundführer + ", Berater=" + berater + ", Krankenvers.="
                + krankenvers + ", Unfallvers.=" + unfallvers + ", Sachvers." + sachvers + ", WP-Rang="
                + wp_rang + ", BS-Rang=" + bs_rang + ", LV-Rang=" + lv_rang + "]";
    }
}
