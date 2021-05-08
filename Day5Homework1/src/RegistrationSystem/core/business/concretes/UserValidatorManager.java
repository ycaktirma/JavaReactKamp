package RegistrationSystem.core.business.concretes;

import java.util.regex.Pattern;

import RegistrationSystem.core.business.abstracts.UserValidator;
import RegistrationSystem.entities.concretes.InMemoryData;
import RegistrationSystem.entities.concretes.User;

public class UserValidatorManager implements UserValidator{
	
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
						Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	public boolean isNameAndSurnameValid(String name, String surname) {		
		return	name.length() >= 2 &&
				surname.length() >= 2;
	}
	
	public boolean isEmailValid(String email) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(email).find();
	}

	public boolean isPasswordValid(String password) {
		return password.length() > 5 ;
	}
	public boolean checkEmailSingularity(String email, InMemoryData inMemoryData) {
		
		for(User user: inMemoryData.getUsers()) {
			if(user.getEmail() == email) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean validateAll(User user, InMemoryData inMemoryData) {
		
		return	isNameAndSurnameValid(user.getName(), user.getPassword()) &&
				isPasswordValid(user.getPassword()) &&
				isEmailValid(user.getEmail()) &&
				checkEmailSingularity(user.getEmail(), inMemoryData);
	}
	
	
	
}
