package com.learn.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.entities.Person;
import com.learn.springboot.service.IPersonService;

@RestController
@RequestMapping("/PersonInfo")
public class PersonController {

	@Autowired
	private IPersonService personService;
	
	@PostMapping("/person")
	public Person savePerson(@RequestBody Person person)
	{
		return personService.addPerson(person);
	}
	
	@GetMapping("/persons")
	public List<Person> getAllPersonsDetails()
	{
		return personService.getAllPersons();
	}
	
	
}
