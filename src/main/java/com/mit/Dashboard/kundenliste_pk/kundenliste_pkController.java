package com.mit.Dashboard.kundenliste_pk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/api")
public class kundenliste_pkController {

    @Autowired
    com.mit.Dashboard.kundenliste_pk.kundenliste_pkService kundenliste_pkService;

   /* @GetMapping("/kundenliste_pk/lv_potenzial")
    public List<kundenliste_pk>

    @GetMapping("/kundenliste_pk/bs_potenzial")
    public List<kundenliste_pk>

    @GetMapping("/kundenliste_pk/wp_potenzial")
    public List<kundenliste_pk>
    */
    @GetMapping("/kundenliste_pk")
    public List<kundenliste_pk> getAllPrivatkunden()
    {
        return kundenliste_pkService.findAll();
    }

}