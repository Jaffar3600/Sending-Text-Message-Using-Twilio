package com.cg.sendsms.sendsms;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class SendsmsApplication implements CommandLineRunner{
	public static final String Auth_SID="ACb91e63fd9062c5e0c1cfc57d36ddb7b8";
	public static final String Auth_Tocken="9b3b939e1a12fe3df8fc2bd00948051e";

	public static void main(String[] args) {
		SpringApplication.run(SendsmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Twilio.init(Auth_SID, Auth_Tocken);
		
		
	Message.creator(
			    new PhoneNumber("+917075003600"),  
			    new PhoneNumber("+19782976199"),  
			    "Hai from java spring boot application application. This is Jaffer Shaik"                   
			).create();
		
	}

}

