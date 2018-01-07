package com.accolite.soap.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.accolite.soap.model.Person;

@WebService
public interface Crud_Interface {
	
	@WebMethod Person getPerson(int id);
	@WebMethod String addPerson(int id,String name);
	@WebMethod Person updatePerson(int id,String name);
	@WebMethod String deletePerson(int id);
	
}
