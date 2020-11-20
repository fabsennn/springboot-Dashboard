package com.mit.Dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GespraechsplanungService {

    @Autowired
    private GespraechsplanungRepository gespraechsplanungRepository;

    public List<Gespraechsplanung> findAll() {

        var it = gespraechsplanungRepository.findAll();

        var gespraeche = new ArrayList<Gespraechsplanung>();
        it.forEach(e -> gespraeche.add(e));

        return gespraeche;

    }

    public Long count() {

        return gespraechsplanungRepository.count();
    }

    public void deleteById(Long id) {

        gespraechsplanungRepository.deleteById(id);
    }
}
