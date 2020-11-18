package com.mit.Dashboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/api")
public class GespraechsplanungController {
    @Autowired
    GespraechsplanungRepository gespraechsplanungRepository;

    ///*
    @GetMapping("/gespraeche")
    public List<Gespraechsplanung> getAllGespraeche() {
        System.out.println("Hole alle Gespräche...");

       //List<Gespraechsplanung> gespraeche = new ArrayList<>();
       return gespraechsplanungRepository.findAll(); //.forEach(gespraeche::add);
    }

    @PostMapping("/gespraeche")
    public Gespraechsplanung addGespreach(
            @RequestBody Gespraechsplanung data
    ){
        Gespraechsplanung saved = gespraechsplanungRepository.save(data);
        return saved;
    }

    /*
    @GetMapping("/gespraeche")
    public List<Gespraechsplanung> getAllGespraeche() {
        //System.out.println("Get all Customers...");

        List<Gespraechsplanung> gespraeche = new ArrayList<>();
        gespraechsplanungRepository.findAll().forEach(gespraeche::add);

        return gespraeche;
    }//*/

    /* FROM TUTORIAL

    @PostMapping(value = "/customers/create")
    public Customer postCustomer(@RequestBody Customer customer) {

        Customer _customer = repository.save(new Customer(customer.getName(), customer.getAge()));
        return _customer;
    }


    @DeleteMapping("/customers/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") long id) {
        System.out.println("Delete Customer with ID = " + id + "...");

        repository.deleteById(id);

        return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
    }

    @DeleteMapping("/customers/delete")
    public ResponseEntity<String> deleteAllCustomers() {
        System.out.println("Delete All Customers...");

        repository.deleteAll();

        return new ResponseEntity<>("All customers have been deleted!", HttpStatus.OK);
    }*/

    @GetMapping(value = "/gespraeche/kundennummer/{kundennummer}")
    public Optional<Gespraechsplanung> findByKundennummer(@PathVariable long kundennummer) {

        Optional<Gespraechsplanung> gespraeche = gespraechsplanungRepository.findById(kundennummer);
        return gespraeche;
    }

    /*
    @PutMapping("/customers/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
        System.out.println("Update Customer with ID = " + id + "...");

        Optional<Customer> customerData = repository.findById(id);

        if (customerData.isPresent()) {
            Customer _customer = customerData.get();
            _customer.setName(customer.getName());
            _customer.setAge(customer.getAge());
            _customer.setActive(customer.isActive());
            return new ResponseEntity<>(repository.save(_customer), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*/
}
