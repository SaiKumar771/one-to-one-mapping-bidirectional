package com.learn.springboot.Repository;

import org.springframework.data.repository.CrudRepository;

import com.learn.springboot.entities.Person;

public interface IPersonRepository extends CrudRepository<Person, Long>{

}
