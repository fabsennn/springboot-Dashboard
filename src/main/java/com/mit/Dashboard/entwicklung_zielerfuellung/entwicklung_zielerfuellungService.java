package com.mit.Dashboard.entwicklung_zielerfuellung;

import com.mit.Dashboard.kundenliste_pk.kundenliste_pk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    // hier public Funktionen einfügen
}
