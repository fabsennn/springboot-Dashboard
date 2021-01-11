package com.mit.Dashboard.entwicklung_zielerfuellung;

import com.mit.Dashboard.Gespraechsplanung;
import com.mit.Dashboard.kundenliste_pk.kundenliste_pk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class entwicklung_zielerfuellungService {

    @Autowired
    private com.mit.Dashboard.entwicklung_zielerfuellung.entwicklung_zielerfuellungRepository entwicklung_zielerfuellungRepository;

    public List<entwicklung_zielerfuellung> findAll()
    {
        var it = entwicklung_zielerfuellungRepository.findAll();

        var ziele = new ArrayList<entwicklung_zielerfuellung>();
        it.forEach(e -> ziele.add(e));

        return ziele;
    }

    public double[] findByEntwicklung_zielerfuellung(){
        var it = entwicklung_zielerfuellungRepository.findAll();

        var all3 = new ArrayList<entwicklung_zielerfuellung>();

        var Plan = "PLAN";

        double []Alles;
        Alles = new double[19];
        for (int i =0; i <= 18; i++)
        {
            Alles[i] = 0;
        }

        double []FKGes;       // Alle kummulierten Werte später für Zielerreichung Jahrz
        FKGes = new double[20];
        for (int i =0; i <= 19; i++)
        {
            FKGes[i] = 0;
        }
        double []PBGes;       // Alle kummulierten Werte später für Zielerreichung Jahry
        PBGes = new double[20];
        for (int i =0; i <= 19; i++)
        {
            PBGes[i] = 0;
        }
        double []PKGes;       // Alle kummulierten Werte später für Zielerreichung Jahrx
        PKGes = new double[20];
        for (int i =0; i <= 19; i++)
        {
            PKGes[i] = 0;
        }

        double []GesMonateEinzelnt;      // Werte für einzelne Monate und einzelne Merkmale 0 - 11 FK, 12 - 23 PB, 24 - 35 PK
        GesMonateEinzelnt = new double[795];    // Zielerreichung Zeitanteil 36 - 47 FK, 48 - 59 PB, 60 - 71 PK
        for (int i =0; i <= 794; i++)           // Zielerreichung Gesamt je Bereich 72 - 74
        {                                      // FK HeatMap 75 - 314 , PB HeatMap 315-554  , PK HeatMap 555 - 794
            GesMonateEinzelnt[i] = 0;
        }

        it.forEach(e -> all3.add(e));

        int a1 = 0, b1 = 0, c1 = 0, d1 = 0, e1 = 0, f1 = 0, g1 = 0, h1 = 0, i1 = 0, j1 = 0, k1 = 0, l1 = 0, m1 = 0, n1 = 0, o1 = 0, p1 = 0, q1 = 0, r1 = 0, s1 = 0;
        int a2 = 12, b2 = 12, c2 = 12, d2 = 12, e2 = 12, f2 = 12, g2 = 12, h2 = 12, i2 = 12, j2 = 12, k2 = 12, l2 = 12, m2 = 12, n2 = 12, o2 = 12, p2 = 12, q2 = 12, r2 = 12, s2 = 12;
        int a3 = 24, b3 = 24, c3 = 24, d3 = 24, e3 = 24, f3 = 24, g3 = 24, h3 = 24, i3 = 24, j3 = 24, k3 = 24, l3 = 24, m3 = 24, n3 = 24, o3 = 24, p3 = 24, q3 = 24, r3 = 24, s3 = 24;
        int zahlerFK = 75;
        int zahlerPB = 315;
        int zahlerPK = 555;

        for(entwicklung_zielerfuellung g: all3){

            if(g.getMarktbereich().equals("FK"))
            {
                GesMonateEinzelnt[zahlerFK] = g.getZielerreichung_zeitanteil();
                zahlerFK ++;
                if(g.getMerkmal().equals("Baufischutz"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[0] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[a1] = GesMonateEinzelnt[a1] + g.getWert_aktueller_zeitraum();
                    a1++;
                }
                else if(g.getMerkmal().equals("Bauspargeschäft"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[1] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[b1] = GesMonateEinzelnt[b1] + g.getWert_aktueller_zeitraum();
                    b1++;
                }
                else if(g.getMerkmal().equals("DekaBankDepots"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[2] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[c1] = GesMonateEinzelnt[c1] + g.getWert_aktueller_zeitraum();
                    c1++;
                }
                else if(g.getMerkmal().equals("Depotgebühren"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[3] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[d1] = GesMonateEinzelnt[d1] + g.getWert_aktueller_zeitraum();
                    d1++;
                }
                else if(g.getMerkmal().equals("Gold pro Aurum"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[4] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[e1] = GesMonateEinzelnt[e1] + g.getWert_aktueller_zeitraum();
                    e1++;
                }
                else if(g.getMerkmal().equals("Immobilienvermittlung mit Kunden"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[5] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[f1] = GesMonateEinzelnt[f1] + g.getWert_aktueller_zeitraum();
                    f1++;
                }
                else if(g.getMerkmal().equals("Jugendgirokonten"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[6] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[g1] = GesMonateEinzelnt[g1] + g.getWert_aktueller_zeitraum();
                    g1++;
                }
                else if(g.getMerkmal().equals("Krankenvers.-Ertrag"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[7] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[h1] = GesMonateEinzelnt[h1] + g.getWert_aktueller_zeitraum();
                    h1++;
                }
                else if(g.getMerkmal().equals("Kreditkarten"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[8] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[i1] = GesMonateEinzelnt[i1] + g.getWert_aktueller_zeitraum();
                    i1++;
                }
                else if(g.getMerkmal().equals("Kreditschutz"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[9] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[j1] = GesMonateEinzelnt[j1] + g.getWert_aktueller_zeitraum();
                    j1++;
                }
                else if(g.getMerkmal().equals("Kundeneinwilligungen"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[10] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[k1] = GesMonateEinzelnt[k1] + g.getWert_aktueller_zeitraum();
                    k1++;
                }
                else if(g.getMerkmal().equals("Lebensversicherungen"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[11] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[l1] = GesMonateEinzelnt[l1] + g.getWert_aktueller_zeitraum();
                    l1++;
                }
                else if(g.getMerkmal().equals("Liquiditätspauschale"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[12] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[m1] = GesMonateEinzelnt[m1] + g.getWert_aktueller_zeitraum();
                    m1++;
                }
                else if(g.getMerkmal().equals("Neukundenakquise"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[13] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[n1] = GesMonateEinzelnt[n1] + g.getWert_aktueller_zeitraum();
                    n1++;
                }
                else if(g.getMerkmal().equals("Sachversicherungen Abschlussprovision"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[14] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[o1] = GesMonateEinzelnt[o1] + g.getWert_aktueller_zeitraum();
                    o1++;
                }
                else if(g.getMerkmal().equals("SCARD Plus"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[15] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[p1] = GesMonateEinzelnt[p1] + g.getWert_aktueller_zeitraum();
                    p1++;
                }
                else if(g.getMerkmal().equals("Strategiegespräche"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[16] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[q1] = GesMonateEinzelnt[q1] + g.getWert_aktueller_zeitraum();
                    q1++;
                }
                else if(g.getMerkmal().equals("Themenpläne"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[17] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[r1] = GesMonateEinzelnt[r1] + g.getWert_aktueller_zeitraum();
                    r1++;
                }
                else if(g.getMerkmal().equals("Zins- und Währungsmanagement"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {FKGes[18] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[s1] = GesMonateEinzelnt[s1] + g.getWert_aktueller_zeitraum();
                    s1++;
                }
            }
            if(g.getMarktbereich().equals("PB"))
            {
                GesMonateEinzelnt[zahlerPB] = g.getZielerreichung_zeitanteil();
                zahlerPB ++;
                if(g.getMerkmal().equals("Baufischutz") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[0] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[a2] = GesMonateEinzelnt[a2] + g.getWert_aktueller_zeitraum();
                    a2++;
                }
                else if(g.getMerkmal().equals("Bauspargeschäft") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[1] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[b2] = GesMonateEinzelnt[b2] + g.getWert_aktueller_zeitraum();
                    b2++;
                }
                else if(g.getMerkmal().equals("DekaBankDepots") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[2] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[c2] = GesMonateEinzelnt[c2] + g.getWert_aktueller_zeitraum();
                    c2++;
                }
                else if(g.getMerkmal().equals("Depotgebühren") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[3] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[d2] = GesMonateEinzelnt[d2] + g.getWert_aktueller_zeitraum();
                    d2++;
                }
                else if(g.getMerkmal().equals("Gold pro Aurum") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[4] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[e2] = GesMonateEinzelnt[e2] + g.getWert_aktueller_zeitraum();
                    e2++;
                }
                else if(g.getMerkmal().equals("Immobilienvermittlung mit Kunden") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[5] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[f2] = GesMonateEinzelnt[f2] + g.getWert_aktueller_zeitraum();
                    f2++;
                }
                else if(g.getMerkmal().equals("Jugendgirokonten") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[6] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[g2] = GesMonateEinzelnt[g2] + g.getWert_aktueller_zeitraum();
                    g2++;
                }
                else if(g.getMerkmal().equals("Krankenvers.-Ertrag") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[7] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[h2] = GesMonateEinzelnt[h2] + g.getWert_aktueller_zeitraum();
                    h2++;
                }
                else if(g.getMerkmal().equals("Kreditkarten") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[8] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[i2] = GesMonateEinzelnt[i2] + g.getWert_aktueller_zeitraum();
                    i2++;
                }
                else if(g.getMerkmal().equals("Kreditschutz") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[9] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[j2] = GesMonateEinzelnt[j2] + g.getWert_aktueller_zeitraum();
                    j2++;
                }
                else if(g.getMerkmal().equals("Kundeneinwilligungen") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[10] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[k2] = GesMonateEinzelnt[k2] + g.getWert_aktueller_zeitraum();
                    k2++;
                }
                else if(g.getMerkmal().equals("Lebensversicherungen") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[11] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[l2] = GesMonateEinzelnt[l2] + g.getWert_aktueller_zeitraum();
                    l2++;
                }
                else if(g.getMerkmal().equals("Liquiditätspauschale") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[12] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[m2] = GesMonateEinzelnt[m2] + g.getWert_aktueller_zeitraum();
                    m2++;
                }
                else if(g.getMerkmal().equals("Neukundenakquise") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[13] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[n2] = GesMonateEinzelnt[n2] + g.getWert_aktueller_zeitraum();
                    n2++;
                }
                else if(g.getMerkmal().equals("Sachversicherungen Abschlussprovision") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[14] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[o2] = GesMonateEinzelnt[o2] + g.getWert_aktueller_zeitraum();
                    o2++;
                }
                else if(g.getMerkmal().equals("SCARD Plus") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[15] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[p2] = GesMonateEinzelnt[p2] + g.getWert_aktueller_zeitraum();
                    p2++;
                }
                else if(g.getMerkmal().equals("Strategiegespräche") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[16] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[q2] = GesMonateEinzelnt[q2] + g.getWert_aktueller_zeitraum();
                    q2++;
                }
                else if(g.getMerkmal().equals("Themenpläne") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[17] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[r2] = GesMonateEinzelnt[r2] + g.getWert_aktueller_zeitraum();
                    r2++;
                }
                else if(g.getMerkmal().equals("Zins- und Währungsmanagement") && g.getMarktbereich().equals("PB"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PBGes[18] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[s2] = GesMonateEinzelnt[s2] + g.getWert_aktueller_zeitraum();
                    s2++;
                }
            }
            if(g.getMarktbereich().equals("PK"))
            {
                GesMonateEinzelnt[zahlerPK] = g.getZielerreichung_zeitanteil();
                zahlerPK ++;
                if(g.getMerkmal().equals("Baufischutz") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[0] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[a3] = GesMonateEinzelnt[a3] + g.getWert_aktueller_zeitraum();
                    a3++;
                }
                else if(g.getMerkmal().equals("Bauspargeschäft") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[1] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[b3] = GesMonateEinzelnt[b3] + g.getWert_aktueller_zeitraum();
                    b3++;
                }
                else if(g.getMerkmal().equals("DekaBankDepots") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[2] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[c3] = GesMonateEinzelnt[c3] + g.getWert_aktueller_zeitraum();
                    c3++;
                }
                else if(g.getMerkmal().equals("Depotgebühren") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[3] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[d3] = GesMonateEinzelnt[d3] + g.getWert_aktueller_zeitraum();
                    d3++;
                }
                else if(g.getMerkmal().equals("Gold pro Aurum") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[4] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[e3] = GesMonateEinzelnt[e3] + g.getWert_aktueller_zeitraum();
                    e3++;
                }
                else if(g.getMerkmal().equals("Immobilienvermittlung mit Kunden") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[5] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[f3] = GesMonateEinzelnt[f3] + g.getWert_aktueller_zeitraum();
                    f3++;
                }
                else if(g.getMerkmal().equals("Jugendgirokonten") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[6] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[g3] = GesMonateEinzelnt[g3] + g.getWert_aktueller_zeitraum();
                    g3++;
                }
                else if(g.getMerkmal().equals("Krankenvers.-Ertrag") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[7] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[h3] = GesMonateEinzelnt[h3] + g.getWert_aktueller_zeitraum();
                    h3++;
                }
                else if(g.getMerkmal().equals("Kreditkarten") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[8] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[i3] = GesMonateEinzelnt[i3] + g.getWert_aktueller_zeitraum();
                    i3++;
                }
                else if(g.getMerkmal().equals("Kreditschutz") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[9] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[j3] = GesMonateEinzelnt[j3] + g.getWert_aktueller_zeitraum();
                    j3++;
                }
                else if(g.getMerkmal().equals("Kundeneinwilligungen") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[10] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[k3] = GesMonateEinzelnt[k3] + g.getWert_aktueller_zeitraum();
                    k3++;
                }
                else if(g.getMerkmal().equals("Lebensversicherungen") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[11] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[l3] = GesMonateEinzelnt[l3] + g.getWert_aktueller_zeitraum();
                    l3++;
                }
                else if(g.getMerkmal().equals("Liquiditätspauschale") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[12] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[m3] = GesMonateEinzelnt[m3] + g.getWert_aktueller_zeitraum();
                    m3++;
                }
                else if(g.getMerkmal().equals("Neukundenakquise") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[13] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[n3] = GesMonateEinzelnt[n3] + g.getWert_aktueller_zeitraum();
                    n3++;
                }
                else if(g.getMerkmal().equals("Sachversicherungen Abschlussprovision") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[14] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[o3] = GesMonateEinzelnt[o3] + g.getWert_aktueller_zeitraum();
                    o3++;
                }
                else if(g.getMerkmal().equals("SCARD Plus") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[15] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[p3] = GesMonateEinzelnt[p3] + g.getWert_aktueller_zeitraum();
                    p3++;
                }
                else if(g.getMerkmal().equals("Strategiegespräche") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[16] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[q3] = GesMonateEinzelnt[q3] + g.getWert_aktueller_zeitraum();
                    q3++;
                }
                else if(g.getMerkmal().equals("Themenpläne") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[17] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[r3] = GesMonateEinzelnt[r3] + g.getWert_aktueller_zeitraum();
                    r3++;
                }
                else if(g.getMerkmal().equals("Zins- und Währungsmanagement") && g.getMarktbereich().equals("PK"))
                {
                    if(g.getZielerreichung_jahr() != 0)
                    {PKGes[18] = g.getZielerreichung_jahr();}
                    GesMonateEinzelnt[s3] = GesMonateEinzelnt[s3] + g.getWert_aktueller_zeitraum();
                    s3++;
                }
            }


            /* if(g.getBerater().equals(bID)){
                if(g.getKategorie().equals(Plan)){
                    PlanGes ++;
                    if(g.getZeitraum().equals("Q1/20"))
                    {PlanQ1 ++;}
                    else if(g.getZeitraum().equals("Q2/20"))
                    {PlanQ2 ++;}
                    else if(g.getZeitraum().equals("Q3/20"))
                    {PlanQ3 ++;}
                    else if(g.getZeitraum().equals("Q4/20"))
                    {PlanQ4 ++;}
                }
                else if(g.getKategorie().equals(Ist)){
                    IstGes ++;
                    if(g.getZeitraum().equals("Q1/20"))
                    {IstQ1 ++;}
                    else if(g.getZeitraum().equals("Q2/20"))
                    {IstQ2 ++;}
                    else if(g.getZeitraum().equals("Q3/20"))
                    {IstQ3 ++;}
                    else if(g.getZeitraum().equals("Q4/20"))
                    {IstQ4 ++;}
                }
            } */
        }
        for(int i =0; i < 19; i++)
        {FKGes[19] = FKGes[19] + FKGes[i];}
        GesMonateEinzelnt[72] = FKGes[19] / 18;
        int ProzentFK = (int)GesMonateEinzelnt[72];
        GesMonateEinzelnt[72] = (double)ProzentFK;

        for(int i =0; i < 19; i++)
        {PBGes[19] = PBGes[19] + PBGes[i];}
        GesMonateEinzelnt[73] = PBGes[19] / 18;
        int ProzentPB = (int)GesMonateEinzelnt[73];
        GesMonateEinzelnt[73] = (double)ProzentPB;

        for(int i =0; i < 19; i++)
        {PKGes[19] = PKGes[19] + PKGes[i];}
        GesMonateEinzelnt[74] = PKGes[19] / 18;
        int ProzentPK = (int)GesMonateEinzelnt[74];
        GesMonateEinzelnt[74] = (double)ProzentPK;

        for(int i = 75; i <= 794; i++)
        {
            int DoubleToInt = (int)GesMonateEinzelnt[i];
            GesMonateEinzelnt[i] = (double)DoubleToInt;
        };

        return GesMonateEinzelnt;

    }
    // hier public Funktionen einfügen
}
