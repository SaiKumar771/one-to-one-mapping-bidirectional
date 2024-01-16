package com.learn.springboot.service;

import java.util.List;

import com.learn.springboot.entities.Person;

public interface IPersonService {
	
	public Person addPerson(Person person);
	
	public List<Person> getAllPersons();

}
