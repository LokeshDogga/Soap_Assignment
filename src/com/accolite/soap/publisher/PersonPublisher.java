package com.accolite.soap.publisher;

import javax.xml.ws.Endpoint;

import com.accolite.soap.services.Person_crud_impl;


public class PersonPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Endpoint.publish("http://localhost:9001/ws/person", new Person_crud_impl());
	}
}
