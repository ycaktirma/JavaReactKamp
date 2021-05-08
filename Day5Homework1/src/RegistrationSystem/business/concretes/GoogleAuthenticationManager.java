package RegistrationSystem.business.concretes;

import RegistrationSystem.business.abstracts.UserService;
import RegistrationSystem.core.business.abstracts.AuthService;
import RegistrationSystem.core.business.abstracts.UserValidator;
import RegistrationSystem.core.business.concretes.GoogleAuthenticationAdapter;
import RegistrationSystem.dataAccess.abstracts.UserDao;
import RegistrationSystem.entities.concretes.User;

public class GoogleAuthenticationManager implements UserService  {

	private UserDao userDao;
	private UserValidator validator;
	private MailValidatorManager mailValidatorManager;
	private AuthService authService;
	
	public GoogleAuthenticationManager(UserDao userDao, UserValidator validator, MailValidatorManager mailValidatorManager, AuthService authService) {
		super();
		this.userDao = userDao;
		this.validator = validator;
		this.mailValidatorManager = mailValidatorManager;
		this.authService = authService;
	}
	
	
	@Override
	public void register(User user) {
		
	}

	@Override
	public void login(User user) {
		this.authService.login();
	}

	@Override
	public void activate(User user) {
		
		
	}

}
