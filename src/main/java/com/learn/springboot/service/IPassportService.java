package com.learn.springboot.service;

import java.util.List;

import com.learn.springboot.entities.Passport;

public interface IPassportService {
	
	public Passport addPerson(Passport passport);
	
	public List<Passport> getAllPersons();

}
