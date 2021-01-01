package com.mit.Dashboard.produktnutzung;

import com.mit.Dashboard.newscard.newscard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProduktNutzungController {

    @Autowired
    private ProduktNutzungService produktNutzungService;

    @GetMapping("/produktnutzung")
    public List<ProduktNutzung> getAllProduktNutzungen() {
        return produktNutzungService.findAllForShow();
    }
}
