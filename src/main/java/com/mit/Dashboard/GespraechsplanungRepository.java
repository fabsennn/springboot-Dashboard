package com.mit.Dashboard;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.mit.Dashboard.Gespraechsplanung;
import org.springframework.stereotype.Repository;

public interface GespraechsplanungRepository extends CrudRepository<Gespraechsplanung, Long> {
}
