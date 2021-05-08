package RegistrationSystem.dataAccess.concretes;

import RegistrationSystem.dataAccess.abstracts.UserDao;
import RegistrationSystem.entities.concretes.InMemoryData;
import RegistrationSystem.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	private InMemoryData inMemoryData;
	
	public InMemoryUserDao(InMemoryData inMemoryData) {
		super();
		this.inMemoryData = inMemoryData;
	}

	@Override
	public void add(User user) {
		
		inMemoryData.getUsers().add(user);
		
		System.out.println("In memory user has been added : " + user.getName());
		
	}

	public void setInMemoryData(InMemoryData inMemoryData) {
		this.inMemoryData = inMemoryData;
	}

	@Override
	public InMemoryData getAll() {
		return inMemoryData;
	}
	
	

}
