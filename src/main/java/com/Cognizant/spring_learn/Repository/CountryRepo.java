package com.Cognizant.spring_learn.Repository;

import com.Cognizant.spring_learn.Model.CountryList;
import com.Cognizant.spring_learn.Model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryRepo {

    public  Country getCountryIndia() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        return  (Country) context.getBean("IN");
    }

    public  Country getCountry(String code){
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        CountryList c=(CountryList)context.getBean("countryList");
        List<Country> lst=c.getCountryList();
        for(Country co:lst){
           if (co.getCode().equalsIgnoreCase(code))return co;
        }
        return  null;
    }
}
