package RegistrationSystem.dataAccess.concretes;

import RegistrationSystem.dataAccess.abstracts.UserDao;
import RegistrationSystem.entities.concretes.InMemoryData;
import RegistrationSystem.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile user eklendi : " + user.getName());
		
	}

	@Override
	public InMemoryData getAll() {
		
		//TODO implement get all users method with hibernate
		
		return null;
	}

}
