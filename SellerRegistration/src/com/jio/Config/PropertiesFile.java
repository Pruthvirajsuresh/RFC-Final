package com.jio.Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.jio.maincode.Registration;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
		
	}

	 public static void readPropertiesFile() {
		 
		 try 
		 {
			 
			InputStream input = new FileInputStream("/home/infibeam/eclipse-workspace/SellerRegistration/src/com/jio/Config/Config.properties");
		    prop.load(input);
		    System.out.println(prop.getProperty("browser"));
		    Registration.browser = prop.getProperty("browser");
		    Registration.invitation_code = prop.getProperty("invitation_code");
		    Registration.personal_pan = prop.getProperty("personal_pan");
		    Registration.business_pan = prop.getProperty("business_pan");
		    Registration.company_pan_name = prop.getProperty("company_pan_name");
		    Registration.cin_number = prop.getProperty("cin_number");
		    Registration.company_name = prop.getProperty("company_name");
		    Registration.office_location = prop.getProperty("office_location");
		    Registration.pincode = prop.getProperty("pincode");
		    Registration.GSTIN = prop.getProperty("GSTIN");
		    Registration.ifsc_code = prop.getProperty("ifsc_code");
		    Registration.bank_account_no = prop.getProperty("bank_account_no");
		    Registration.account_holder_name = prop.getProperty("account_holder_name");
		    Registration.catagory = prop.getProperty("catagory");
		    Registration.Expiry_year = prop.getProperty("Expiry_year");
		    Registration.Expiry_month = prop.getProperty("Expiry_month");
		    Registration.Expiry_day = prop.getProperty("Expiry_day");
		 
		 } 
		 
		 catch (Exception e) 
		 {
			
			e.printStackTrace();
		 }
	 }
	 
	 public static void writePropertiesFile() {
		 
		 try 
		 {
	 
			 OutputStream output = new FileOutputStream("/home/infibeam/eclipse-workspace/SellerRegistration/src/com/jio/Config/Config.properties");
		     prop.setProperty("browser", "Chrome");
		     prop.store(output, null);
		 
		 } 
		 
		 catch (Exception e) 
		 {
			
			e.printStackTrace();
	     }
		 		 
	 }
	 
















}




