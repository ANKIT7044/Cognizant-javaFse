package com.Cognizant.spring_learn.Service;

import com.Cognizant.spring_learn.Model.Country;
import com.Cognizant.spring_learn.Repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    @Autowired
    CountryRepo r;

    public Country getCountryIndia(){
        return r.getCountryIndia();
    }

    public  Country getCountry(String code){
        return  r.getCountry(code);
    }
}
