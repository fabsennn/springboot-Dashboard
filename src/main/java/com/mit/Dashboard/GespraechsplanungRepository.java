package com.mit.Dashboard;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.mit.Dashboard.Gespraechsplanung;

public interface GespraechsplanungRepository extends CrudRepository<Gespraechsplanung, Long> {
    List<Gespraechsplanung> findByKundennummer(int kundennummer);
    List<Gespraechsplanung> findAll();
}
