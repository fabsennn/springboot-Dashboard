package com.mit.Dashboard.newscard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class newscardController {

    @Autowired
    private newscardRepository newscardRepository;

    @RequestMapping(path = "/news/{neuigkeit}/{berater}/{dringlichkeit}", method = RequestMethod.POST)
    public void News(@PathVariable() String neuigkeit, @PathVariable() String berater,
                     @PathVariable() String dringlichkeit)
    {
        newscard NeueNews = new newscard(neuigkeit, berater, dringlichkeit);
        this.newscardRepository.save(NeueNews);
    }
}
