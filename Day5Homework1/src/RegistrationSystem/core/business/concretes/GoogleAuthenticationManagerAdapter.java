package RegistrationSystem.core.business.concretes;

import GoogleAuthenticaton.GoogleAuthManager;
import RegistrationSystem.core.business.abstracts.AuthService;

public class GoogleAuthenticationManagerAdapter implements AuthService{
	public void login() {
		GoogleAuthManager googleAuth = new GoogleAuthManager();
		googleAuth.login();
	}
}
