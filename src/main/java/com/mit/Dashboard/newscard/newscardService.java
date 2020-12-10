package com.mit.Dashboard.newscard;

import com.mit.Dashboard.kundenliste_pk.kundenliste_pk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class newscardService {

    @Autowired
    private newscardRepository newscardRepository;

    public List<newscard> findAll() {
        var it = newscardRepository.findAll();

        var allnews = new ArrayList<newscard>();
        it.forEach(e -> allnews.add(e));

        return allnews;
    }

    public List<newscard> findnewsbyberatername(String beratername)
    {
        var it = newscardRepository.findAll();
        var all = new ArrayList<newscard>();
        var result = new ArrayList<newscard>();

        it.forEach(e -> all.add(e));

        for (newscard k : all) {
            if (k.getBerater().equals(beratername)) {
                result.add(k);
            }
        }
        return result;
    }
}
