package com.mit.Dashboard.newscard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class newscardController {

    @Autowired
    private newscardRepository newscardRepository;

    @RequestMapping(path = "/news", method = RequestMethod.POST)
    public void News(@RequestParam() String neuigkeit, @RequestParam String berater,
                     @RequestParam String dringlichkeit)
    {
        newscard NeueNews = new newscard(neuigkeit, berater, dringlichkeit);
        this.newscardRepository.save(NeueNews);
    }
}
