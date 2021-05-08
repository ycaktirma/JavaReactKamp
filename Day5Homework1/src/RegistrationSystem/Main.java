package RegistrationSystem;

import RegistrationSystem.business.abstracts.UserService;
import RegistrationSystem.business.concretes.GoogleAuthenticationManager;
import RegistrationSystem.business.concretes.MailValidatorManager;
import RegistrationSystem.business.concretes.UserManager;
import RegistrationSystem.core.business.concretes.GoogleAuthenticationManagerAdapter;
import RegistrationSystem.core.business.concretes.UserValidatorManager;
import RegistrationSystem.dataAccess.concretes.InMemoryUserDao;
import RegistrationSystem.entities.concretes.InMemoryData;
import RegistrationSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InMemoryData inMemoryDatabase = new InMemoryData();
		
		UserService userService = new UserManager(
													new InMemoryUserDao(inMemoryDatabase),
													new UserValidatorManager(),
													new MailValidatorManager());
		
		UserService googleUserService = new GoogleAuthenticationManager(
																		new InMemoryUserDao(inMemoryDatabase),
																		new UserValidatorManager(),
																		new MailValidatorManager(),
																		new GoogleAuthenticationManagerAdapter());

		User user = new User(1,"Yarkýn","Çaktýrma","ycaktirma@gmail.com","23213213",false);
		userService.register(user);
		User user2 = new User(1,"Yarkýn","Çaktýrma","ycaktirma@gmail.com","23213213",false);
		userService.register(user2);
		
		
		User user3 = new User(2,"Emirhan","Ay","emirhanay@gmail.com","11299999",false);
		googleUserService.login(user3);
		
		//userService.login(user);
		
		for(User tempUser:inMemoryDatabase.getUsers()) {
			System.out.println(tempUser.getEmail());
		}
		
		
		
	}

}
