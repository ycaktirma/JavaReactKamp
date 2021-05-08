package RegistrationSystem.core.business.abstracts;

import RegistrationSystem.entities.concretes.InMemoryData;
import RegistrationSystem.entities.concretes.User;

public interface UserValidator {
	public boolean isNameAndSurnameValid(String name, String surname);
	public boolean isEmailValid(String email);
	public boolean isPasswordValid(String password);
	public boolean validateAll(User user, InMemoryData inMemoryData);
	public boolean checkEmailSingularity(String email, InMemoryData inMemoryData);
}
