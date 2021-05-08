package RegistrationSystem.business.concretes;

import RegistrationSystem.business.abstracts.MailValidatorService;

public class MailValidatorManager implements MailValidatorService{

	@Override
	public void sendValidationMail() {
		System.out.println("Validation email has been sent");
		
	}

}
