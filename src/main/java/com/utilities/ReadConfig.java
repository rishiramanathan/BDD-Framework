package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig{

Properties prop;

public ReadConfig()

{
	
	File src = new File(System.getProperty("user.dir")+"//Configuration//config.properties");
	
	try
	{
		FileInputStream fis = new FileInputStream(src);
		prop = new Properties();
		prop.load(fis);
	} 
	catch (Exception e) 
	{
		System.out.println("Exception is "+ e.getMessage());
	}
}

public String getApplication()
{
	String url = prop.getProperty("url");
	return url;
}

public String getFirstname() 
{
	String firstname = prop.getProperty("First_Name");
	return firstname;
}

public String getLastname() 
{
	String lastname = prop.getProperty("Last_Name");
	return lastname;
}

public String getAddress() 
{
	String Address = prop.getProperty("Street_address");
	return Address;
}

public String getTown() 
{
	String Town = prop.getProperty("Town");
	return Town;
}

public String getZipCode() 
{
	String ZipCode = prop.getProperty("Zipcode");
	return ZipCode;
}

public String getEmail() 
{
	String Email_add = prop.getProperty("Email_add");
	return Email_add;
}

public String getUsername()
{
	String user = prop.getProperty("Username");
	return user;
}

public String getEmail_Register() {
	String Email = prop.getProperty("Email");
	return Email;
}
public String getPassword()
{
	String Pass = prop.getProperty("Email");
	return Pass;
}
	
}
