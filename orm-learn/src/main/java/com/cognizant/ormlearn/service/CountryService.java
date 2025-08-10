package com.cognizant.ormlearn.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

import jakarta.transaction.Transactional;

@Service
public class CountryService {
	@Autowired
	private CountryRepository repo;
	
	@Transactional
	public List<Country> getAllCountries(){
		return repo.findAll();
	}
	
	@Transactional
	public Country findCountryByCode(String code) throws CountryNotFoundException {
	    System.out.println("Looking for country with code: '" + code + "'");
	    Optional<Country> res = repo.findById(code);
	    if (!res.isPresent()) {
	        throw new CountryNotFoundException("Country not found: " + code);
	    }
	    return res.get();
	}

	
	@Transactional
	public void addCountry(Country c) {
		repo.save(c);
	}
	
}
