package com.example.spinner;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBeers (String beerType){
        List<String> beers = new ArrayList<>();
        switch (beerType){
            case "светлое":
                beers.add("Светлое А");
                beers.add("Светлое Б");
                break;
            case "темное":
                beers.add("темное C");
                beers.add("темное D");
                break;
        }
        return beers;
    }
}
