package com.mit.Dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yy");

        for (Gespraechsplanung gespraech : gespraechsPlanungen) {
            if (gespraech.getNaechsteFaelligkeit() == null) {
                continue;
            }

            LocalDate date;
            try {
                date = LocalDate.parse(gespraech.getNaechsteFaelligkeit(), formatter);
            } catch (Exception e) {
                continue;
            }

            TodoDto todoDto = new TodoDto(
                    date,
                    gespraech.getKundenname(),
                    gespraech.getKundennummer());
            todos.add(todoDto);
        }
        Collections.sort(todos);
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
    public List<Gespraechsplanung> findByPlanIst(String bKat){
        var it = gespraechsplanungRepository.findAll();

        var all2 = new ArrayList<Gespraechsplanung>();
        var result2 = new ArrayList<Gespraechsplanung>();

        it.forEach(e -> all2.add(e));

        for(Gespraechsplanung g: all2){
            if(g.getKategorie().equals(bKat)){
                result2.add(g);
            }
        }

        return result2;

    }

    public int[] findByPlanIstBerater(String bID){
        var it = gespraechsplanungRepository.findAll();

        var all3 = new ArrayList<Gespraechsplanung>();

        var Plan = "PLAN";
        var Ist = "IST";
        var PlanGes = 0;
        var PlanQ1 = 0;
        var PlanQ2 = 0;
        var PlanQ3 = 0;
        var PlanQ4 = 0;
        var IstGes = 0;
        var IstQ1 = 0;
        var IstQ2 = 0;
        var IstQ3 = 0;
        var IstQ4 = 0;

        it.forEach(e -> all3.add(e));

        for(Gespraechsplanung g: all3){
            if(g.getBerater().equals(bID)){
                if(g.getKategorie().equals(Plan)){
                    PlanGes ++;
                    if(g.getZeitraum().equals("Q1/20"))
                    {PlanQ1 ++;}
                    else if(g.getZeitraum().equals("Q2/20"))
                    {PlanQ2 ++;}
                    else if(g.getZeitraum().equals("Q3/20"))
                    {PlanQ3 ++;}
                    else if(g.getZeitraum().equals("Q4/20"))
                    {PlanQ4 ++;}
                }
                else if(g.getKategorie().equals(Ist)){
                    IstGes ++;
                    if(g.getZeitraum().equals("Q1/20"))
                    {IstQ1 ++;}
                    else if(g.getZeitraum().equals("Q2/20"))
                    {IstQ2 ++;}
                    else if(g.getZeitraum().equals("Q3/20"))
                    {IstQ3 ++;}
                    else if(g.getZeitraum().equals("Q4/20"))
                    {IstQ4 ++;}
                }
            }


        }
        int [ ] Tabelle = {PlanGes,PlanQ1,PlanQ2,PlanQ3,PlanQ4,IstGes,IstQ1,IstQ2,IstQ3,IstQ4};
        return Tabelle;

    }

    public Long count() {

        return gespraechsplanungRepository.count();
    }

    public void deleteById(Long id) {

        gespraechsplanungRepository.deleteById(id);
    }

}
