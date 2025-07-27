package com.Cognizant.spring_learn.Controller;

import com.Cognizant.spring_learn.Model.Country;
import com.Cognizant.spring_learn.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @Autowired
    CountryService s;

    @GetMapping("/country")
    public Country getCountryIndia(){
        return s.getCountryIndia();
    }

    @GetMapping("/countries/{code}")
    public  Country getCountry(@PathVariable String code){
        return s.getCountry(code);
    }
}
