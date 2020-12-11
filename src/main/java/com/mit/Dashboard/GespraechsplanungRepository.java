package com.mit.Dashboard;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface GespraechsplanungRepository extends CrudRepository<Gespraechsplanung, Long> {

    public List<Gespraechsplanung> findAllByBerater(String berater);
}
