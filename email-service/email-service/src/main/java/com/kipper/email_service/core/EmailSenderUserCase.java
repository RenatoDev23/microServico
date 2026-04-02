
package com.kipper.email_service.core;

public interface EmailSenderUserCase {
	
	//interfaçe que define o contrado da aplicação 
	void sendEmail(String to,String subject, String body);
	

}
