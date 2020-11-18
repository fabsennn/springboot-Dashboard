package com.mit.Dashboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mit.Dashboard.Gespraechsplanung;
import com.mit.Dashboard.GespraechsplanungRepository;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/api")
public class GespraechsplanungController {
    @Autowired
    GespraechsplanungRepository repository;

    @GetMapping("/gespraeche")
    public String/*List<Gespraechsplanung>*/ getAllGespraeche() {
        /*System.out.println("Hole alle Gespräche...");

        List<Gespraechsplanung> gespraeche = new ArrayList<>();
        repository.findAll().forEach(gespraeche::add);*/

        return "Klappt!";
    }

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

    @GetMapping(value = "/customers/kundennummer/{kundennummer}")
    public List<Gespraechsplanung> findByKundennummer(@PathVariable int kundennummer) {

        List<Gespraechsplanung> gespraeche = repository.findByKundennummer(kundennummer);
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
