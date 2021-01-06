package com.mit.Dashboard.newscard;

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

    public List<newscard> findnewsbyberaternameaufsteigenddatum(String beratername)
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

    public ArrayList<newscard> findnewsbyberaternameabsteigenddatum(String beratername)
    {
        var result = findnewsbyberaternameaufsteigenddatum(beratername);

        var result2 = new ArrayList<newscard>();

        for(int listSize = result.size() - 1; listSize >= 0; listSize--) {
            result2.add(result.get(listSize));
        }

        return result2;
    }

    public List<newscard> findnewsbyberaternamedringlichkeit(String beratername)
    {
        var it = newscardRepository.findAll();
        var all = new ArrayList<newscard>();
        var result = new ArrayList<newscard>();

        it.forEach(e -> all.add(e));

        for (newscard k : all) {
            if (k.getBerater().equals(beratername)) {
               if (k.getDringlichkeit().equals("Sofort"))
               {result.add(k);}
            }
        }
        for (newscard k : all) {
            if (k.getBerater().equals(beratername)) {
                if (k.getDringlichkeit().equals("Sehr dringend"))
                {result.add(k);}
            }
        }
        for (newscard k : all) {
            if (k.getBerater().equals(beratername)) {
                if (k.getDringlichkeit().equals("Dringend"))
                {result.add(k);}
            }
        }
        for (newscard k : all) {
            if (k.getBerater().equals(beratername)) {
                if (k.getDringlichkeit().equals("Normal"))
                {result.add(k);}
            }
        }
        for (newscard k : all) {
            if (k.getBerater().equals(beratername)) {
                if (k.getDringlichkeit().equals("Nicht dringend"))
                {result.add(k);}
            }
        }
        return result;
    }
}
