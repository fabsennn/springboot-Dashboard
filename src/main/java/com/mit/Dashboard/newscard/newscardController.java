package com.mit.Dashboard.newscard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Blob;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class newscardController {

    @Autowired
    private newscardRepository newscardRepository;

    @RequestMapping(path = "/news/{neuigkeit}/{berater}/{dringlichkeit}/{datum}", method = RequestMethod.POST)
    public void News(@PathVariable() String neuigkeit, @PathVariable() String berater,
                     @PathVariable() String dringlichkeit, @PathVariable() String datum, @PathVariable() Blob datei)
    {
        newscard NeueNews = new newscard(neuigkeit, berater, dringlichkeit, datum, datei);
        this.newscardRepository.save(NeueNews);
    }

    @Autowired
    private newscardService newscardService;

    @GetMapping("/news")
    public List<newscard> getAllNews() {return newscardService.findAll();}

    @GetMapping("/news/newsbyberatername/{beraterName}")
    public List<newscard> getNews(@PathVariable String beraterName)
    {
        return newscardService.findnewsbyberatername(beraterName);
    }
}
