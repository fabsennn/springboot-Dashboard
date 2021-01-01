package com.mit.Dashboard.produktnutzung;

import com.mit.Dashboard.newscard.newscard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduktNutzungService {

    @Autowired
    private ProduktNutzungRepository produktNutzungRepository;

    public List<ProduktNutzung> findAll()
    {
        List<ProduktNutzung> produktNutzungs = new ArrayList<>();
        produktNutzungRepository.findAll().forEach(p -> produktNutzungs.add(p));
        return produktNutzungs;
    }
}
