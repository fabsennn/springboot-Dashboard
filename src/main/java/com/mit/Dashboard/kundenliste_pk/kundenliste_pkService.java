package com.mit.Dashboard.kundenliste_pk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class kundenliste_pkService {

    @Autowired
    private com.mit.Dashboard.kundenliste_pk.kundenliste_pkRepository kundenliste_pkRepository;

    public List<kundenliste_pk> findAll() {
        var it = kundenliste_pkRepository.findAll();

        var privatkunden = new ArrayList<kundenliste_pk>();
        it.forEach(e -> privatkunden.add(e));

        return privatkunden;
    }

    public List<kundenliste_pk> findByKunde(Integer kundennummer) {
        var it = kundenliste_pkRepository.findAll();
        var all = new ArrayList<kundenliste_pk>();
        var result = new ArrayList<kundenliste_pk>();

        it.forEach(e -> all.add(e));

        for (kundenliste_pk k : all) {
            if (k.getVerbundführer() == kundennummer) {
                result.add(k);
            }
        }
        return result;
    }

    public List<kundenliste_pk> findLVPotenzialByBerater(String bID) {
        var it = kundenliste_pkRepository.findAll();
        var all = new ArrayList<kundenliste_pk>();
        var result = new ArrayList<kundenliste_pk>();
        it.forEach(e -> all.add(e));

        for (kundenliste_pk k : all) {
            if (k.getBerater().equals(bID) && k.getLv_rang() <= 15 && k.getLv_rang()!=0) {
                result.add(k);
            }
        }
        return result;
    }

    public List<kundenliste_pk> findWPPotenzialByBerater(String bID) {
        var it = kundenliste_pkRepository.findAll();
        var all = new ArrayList<kundenliste_pk>();
        var result = new ArrayList<kundenliste_pk>();
        it.forEach(e -> all.add(e));

        for (kundenliste_pk k : all) {
            if (k.getBerater().equals(bID) && k.getWp_rang() <= 15 && k.getWp_rang()!=0) {
                result.add(k);
            }
        }
        return result;
    }

    public List<kundenliste_pk> findBSPotenzialByBerater(String bID) {
        var it = kundenliste_pkRepository.findAll();
        var all = new ArrayList<kundenliste_pk>();
        var result = new ArrayList<kundenliste_pk>();
        it.forEach(e -> all.add(e));

        for (kundenliste_pk k : all) {
            if (k.getBerater().equals(bID) && k.getBs_rang() <= 15 && k.getBs_rang()!=0) {
                result.add(k);
            }
        }
        return result;
    }
}
