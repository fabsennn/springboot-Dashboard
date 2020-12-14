package com.mit.Dashboard;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/api")
public class GespraechsplanungController {

    @Autowired
    GespraechsplanungService gespraechsplanungService;

    ///*
    @GetMapping("/gespraeche")
    public List<Gespraechsplanung> getAllGespraeche() {
        return gespraechsplanungService.findAll();
    }

    @GetMapping("/gespraeche/berater/{beraterid}")
    public List<Gespraechsplanung> getBeraterGespraeche(@PathVariable String beraterid) {
        return gespraechsplanungService.findByBerater(beraterid);
    }

    @GetMapping("/gespraeche/berater/{beraterid}/plan")
    public List<Gespraechsplanung> getPlanBeraterGespraeche(@PathVariable String beraterid) {
        return gespraechsplanungService.findPlanByBerater(beraterid);
    }

    @GetMapping("/todo/berater/{beraterid}")
    public List<TodoDto> getBeraterTodo(@PathVariable String beraterid) {
        return gespraechsplanungService.findTodoByBerater(beraterid);
    }
    @GetMapping("/gespraeche/berater/PlanIst/{KatName}")
    public List<Gespraechsplanung> getPlanIstDonut(@PathVariable String KatName) {
        return gespraechsplanungService.findByPlanIst(KatName);
    }

    @GetMapping("/gespraeche/berater/PlanIst/Kategorie/{bid}")
    public int[] getPlanIstBerater(@PathVariable String bid) {
        return gespraechsplanungService.findByPlanIstBerater(bid);
    }

    @PatchMapping("/gespraeche/ist/{gespraechID}")
    public void setGespraechToIst(@PathVariable int gespraechID) {
        gespraechsplanungService.setGespraechToIst(gespraechID);
    }

    @PatchMapping("/gespraeche/plan/{gespraechID}")
    public void setGespraechToPlan (@PathVariable int gespraechID) {
        gespraechsplanungService.setGespraechToPlan(gespraechID);
    }

}



