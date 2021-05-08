package RegistrationSystem.entities.concretes;

import java.util.ArrayList;

import RegistrationSystem.entities.abstracts.Entity;


public class InMemoryData implements Entity {
	ArrayList<User> users = new ArrayList<User>();

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}


}
