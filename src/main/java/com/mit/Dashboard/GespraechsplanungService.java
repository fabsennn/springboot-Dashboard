package com.mit.Dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GespraechsplanungService {

    @Autowired
    private GespraechsplanungRepository gespraechsplanungRepository;

    public List<Gespraechsplanung> findAll() {

        var it = gespraechsplanungRepository.findAll();

        var gespraeche = new ArrayList<Gespraechsplanung>();
        it.forEach(e -> gespraeche.add(e));

        return gespraeche;

    }

    public List<Gespraechsplanung> findByBerater(String bID){
        var it = gespraechsplanungRepository.findAll();

        var all = new ArrayList<Gespraechsplanung>();
        var result = new ArrayList<Gespraechsplanung>();

        it.forEach(e -> all.add(e));

        for(Gespraechsplanung g: all){
            if(g.getBerater().equals(bID)){
                result.add(g);
            }
        }

        return result;
    }

    public List<TodoDto> findTodoByBerater(String berater) {
        List<Gespraechsplanung> gespraechsPlanungen = gespraechsplanungRepository.findAllByBerater(berater);
        List<TodoDto> todos = new ArrayList<>();

        for (Gespraechsplanung gespraech : gespraechsPlanungen) {
            TodoDto todoDto = new TodoDto(
                    gespraech.getNaechsteFaelligkeit(),
                    gespraech.getKundennummer());
            todos.add(todoDto);
        }
        return todos;
    }

    public List<Gespraechsplanung> findPlanByBerater(String bID) {
        var it = gespraechsplanungRepository.findAll();

        var all = new ArrayList<Gespraechsplanung>();
        var result = new ArrayList<Gespraechsplanung>();

        it.forEach(e -> all.add(e));

        for(Gespraechsplanung g: all){
            if(g.getBerater().equals(bID) && g.getKategorie().equals("PLAN")){
                result.add(g);
            }
        }

        return result;

    }


    public Long count() {

        return gespraechsplanungRepository.count();
    }

    public void deleteById(Long id) {

        gespraechsplanungRepository.deleteById(id);
    }


}
