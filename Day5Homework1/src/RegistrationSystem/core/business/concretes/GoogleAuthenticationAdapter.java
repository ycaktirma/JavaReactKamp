package RegistrationSystem.core.business.concretes;

import RegistrationSystem.business.abstracts.UserService;
import RegistrationSystem.entities.concretes.User;

public class GoogleAuthenticationAdapter {
	public void register(){
		System.out.println("Google register");
	}
	public void login(){
		System.out.println("Google login");
	}

}
