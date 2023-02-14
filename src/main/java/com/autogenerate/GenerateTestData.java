package com.autogenerate;


import com.github.javafaker.Faker;

public class GenerateTestData {
	Faker faker = new Faker();;
	
	public String Name() {
		String Fname = faker.name().username();
		return Fname;
	}

	public String Email() {
		String FirstName = faker.name().firstName();
		String LastName = faker.name().lastName();
		
		String email = FirstName.toLowerCase() + "." + LastName.toLowerCase() +"@domain.com";
		
		return email;
	}
	
	public String Password_for_Register() {
		String Pass = faker.name().name();
		return Pass;
	}
}
