package com.learn.springboot.Repository;

import org.springframework.data.repository.CrudRepository;

import com.learn.springboot.entities.Passport;


public interface IPassportRepository extends CrudRepository<Passport, Integer>{

}
