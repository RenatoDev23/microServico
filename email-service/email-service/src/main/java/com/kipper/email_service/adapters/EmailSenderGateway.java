package com.kipper.email_service.adapters;

public interface EmailSenderGateway {
	
	//logica de negicio da implementação
	void sendEmail(String to, String subject, String body);

}
