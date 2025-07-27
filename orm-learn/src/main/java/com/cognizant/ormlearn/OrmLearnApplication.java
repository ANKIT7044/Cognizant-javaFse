package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger log= LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService serv;
	public static void main(String[] args) throws CountryNotFoundException {
		SpringApplication.run(OrmLearnApplication.class, args);
		ApplicationContext context=SpringApplication.run(OrmLearnApplication.class, args);
		serv=context.getBean(CountryService.class);
		
		 testGetAllCountries();
		 testFindCountryByCode();
	}
	private static void testGetAllCountries() {
		log.info("Start");
		List<Country> c=serv.getAllCountries();
		log.debug("Countries: {}", c);
        log.info("End");
	}
private static void testFindCountryByCode() throws CountryNotFoundException{
	log.info("Start");
	Country c=serv.findCountryByCode("IN");
	log.debug("Countries: {}", c);
    log.info("End");
	}
}
