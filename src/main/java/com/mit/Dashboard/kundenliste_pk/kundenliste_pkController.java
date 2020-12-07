package com.mit.Dashboard.kundenliste_pk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/api")
public class kundenliste_pkController {

    @Autowired
    com.mit.Dashboard.kundenliste_pk.kundenliste_pkService kundenliste_pkService;

    @GetMapping("/kundenliste_pk")
    public List<kundenliste_pk> getAllPrivatkunden()
    {
        return kundenliste_pkService.findAll();
    }

    @GetMapping("/kundenliste_pk/kunde/{kundennummer}")
    public List<kundenliste_pk> getKundenVers(@PathVariable int kundennummer){
        return kundenliste_pkService.findByKunde(kundennummer);
    }
    @GetMapping("/kundenliste_pk/all_potenzial/{bID}")
    public List<kundenliste_pk> getAllPotenzial(@PathVariable String bID) { return kundenliste_pkService.findAllPotenzialByBerater(bID);}
}
