package com.mit.Dashboard.entwicklung_zielerfuellung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class entwicklung_zielerfuellungController {

    @Autowired
    com.mit.Dashboard.entwicklung_zielerfuellung.entwicklung_zielerfuellungService entwicklung_zielerfuellungService;

    // hier @GetMapping hinzufügen
}
