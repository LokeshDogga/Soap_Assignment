package com.accolite.soap.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.accolite.soap.model.Person;


@WebService(endpointInterface="com.accolite.soap.services.Crud_Interface")
public class Person_crud_impl implements Crud_Interface{

	List<Person> persons  = new ArrayList<Person>();
	
	@Override
	public Person getPerson(int id) {
		
		for(Person obj:persons)
		{
			if(obj.getId()==id)
				return obj;
		}
		return null;
	}

	@Override
	public String addPerson(int id, String name) {
		if(getPerson(id) == null) {
			Person obj = new Person(id,name);
			persons.add(obj);
			return "Succesfully added person";
		}
		return "Person already Exists";
	}

	@Override
	public Person updatePerson(int id, String name) {
		for(Person obj:persons)
		{
			if(obj.getId()==id)
			{
				obj.setName(name);
				return obj;
			}
		}
		return null;
	}

	@Override
	public String deletePerson(int id) {
		for(Person obj:persons)
		{
			if(obj.getId()==id)
			{
				persons.remove(obj);
				return "Succesfully removed person";
			}
		}
		return "Failed to Delete Person";
	}
}
