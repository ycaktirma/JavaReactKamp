package RegistrationSystem.dataAccess.abstracts;


import RegistrationSystem.entities.concretes.InMemoryData;
import RegistrationSystem.entities.concretes.User;

public interface UserDao {
	void add(User user);
	InMemoryData getAll();
}
