package com.learn.springboot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.springboot.Repository.IPersonRepository;
import com.learn.springboot.entities.Person;

@Service
public class PersonServiceImpl implements IPersonService {
	
	@Autowired
	private IPersonRepository personRepository;

	@Override
	public Person addPerson(Person person) {
		
		return personRepository.save(person);
	}

	@Override
	public List<Person> getAllPersons() {
		
		Iterator<Person> persons=personRepository.findAll().iterator();
		List<Person> personList=new ArrayList<>();
		
		while(persons.hasNext())
		{
			personList.add(persons.next());
		}
		
		return personList;
	}
	
}
