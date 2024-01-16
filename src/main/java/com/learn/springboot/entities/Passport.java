package com.learn.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passport {
	
	@Id
	private int passportNo;
	
	private String nationality;
	private int yearsOfValidity;
	
	@OneToOne(mappedBy="passport")
	private Person person;

}
