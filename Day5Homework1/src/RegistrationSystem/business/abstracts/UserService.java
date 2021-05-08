package RegistrationSystem.business.abstracts;

import RegistrationSystem.entities.concretes.User;

public interface UserService{
	public void register(User user);
	public void login(User user);
	public void activate(User user);
}
