package com.mit.Dashboard.newscard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class newscardController {

    @Autowired
    private newscardRepository newscardRepository;

    @RequestMapping(path = "/news/{neuigkeit}/{berater}/{dringlichkeit}/{datum}/{datei}", method = RequestMethod.POST)
    public void News(@PathVariable() String neuigkeit, @PathVariable() String berater,
                     @PathVariable() String dringlichkeit, @PathVariable() String datum, @PathVariable File datei)
    {
        newscard NeueNews = new newscard(neuigkeit, berater, dringlichkeit, datum, datei);
        this.newscardRepository.save(NeueNews);
    }

    @Autowired
    private newscardService newscardService;

    @GetMapping("/news")
    public List<newscard> getAllNews() {return newscardService.findAll();}

    @GetMapping("/news/newsbyberaternameaufsteigenddatum/{beraterName}")
    public List<newscard> getNewsDatumAufsteigend(@PathVariable String beraterName)
    {
        return newscardService.findnewsbyberaternameaufsteigenddatum(beraterName);
    }

    @GetMapping("/news/newsbyberaternamedringlichkeit/{beraterName}")
    public List<newscard> getNewsDringlichkeit(@PathVariable String beraterName)
    {
        return newscardService.findnewsbyberaternamedringlichkeit(beraterName);
    }

    @GetMapping("/news/newsbyberaternameabsteigenddatum/{beraterName}")
    public List<newscard> getNewsDatumAbsteigend(@PathVariable String beraterName)
    {
        return newscardService.findnewsbyberaternameabsteigenddatum(beraterName);
    }
}