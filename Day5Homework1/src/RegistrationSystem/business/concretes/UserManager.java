package RegistrationSystem.business.concretes;

import RegistrationSystem.business.abstracts.UserService;
import RegistrationSystem.core.business.abstracts.UserValidator;
import RegistrationSystem.dataAccess.abstracts.UserDao;
import RegistrationSystem.entities.concretes.User;
import java.util.regex.Pattern;

public class UserManager implements UserService{

	private UserDao userDao;
	private UserValidator validator;
	private MailValidatorManager mailValidatorManager;
	
	public UserManager(UserDao userDao, UserValidator validator, MailValidatorManager mailValidatorManager) {
		super();
		this.userDao = userDao;
		this.validator = validator;
		this.mailValidatorManager = mailValidatorManager;
	}

	@Override
	public void register(User user) {
		boolean valid = validator.validateAll(user, userDao.getAll() );
		
		if(!valid) {
			System.out.println("Kullanýcý geçerli deðil");
			return;
		}
						
		this.mailValidatorManager.sendValidationMail();
		this.activate(user);
		
	}

	@Override
	public void login(User user) {
        boolean isValidTrue = false;

        for (User temporaryUser : userDao.getAll().getUsers() ) {
            if (user.getEmail() == temporaryUser.getEmail() && user.getPassword() == temporaryUser.getPassword()) {
                    isValidTrue = true;

            }

        }

        if(isValidTrue == true) {
            System.out.println("Login successful \nWelcome!");
        }
        else {
            System.out.println("Login failed");
        }
	}

	@Override
	public void activate(User user) {
		user.setActivation(true);
		this.userDao.add(user);
	}
	
	

}
