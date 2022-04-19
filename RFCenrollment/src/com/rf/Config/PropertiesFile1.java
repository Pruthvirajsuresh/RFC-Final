package com.rf.Config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import com.rfc.maincode1.Enrolmentrfc;

public class PropertiesFile1 {
static Properties prop1 = new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		
	}

	 public static void readPropertiesFile() {
		 
		 try 
		 {
			 
			InputStream input = new FileInputStream("/home/infibeam/eclipse-workspace/RFCenrollment/src/com/rf/Config/Config1.properties");
		    prop1.load(input);
		    Enrolmentrfc.browser = prop1.getProperty("browser");
		    Enrolmentrfc.seller_name = prop1.getProperty("seller_name");
		    Enrolmentrfc.seller_pwd = prop1.getProperty("seller_pwd");
		    Enrolmentrfc.GSTIN = prop1.getProperty("GSTIN");
		    Enrolmentrfc.RFC_STATE = prop1.getProperty("RFC_STATE");
		    Enrolmentrfc.RFC_NAME = prop1.getProperty("RFC_NAME");
		 } 
		 
		 catch (Exception e) 
		 {
			
			e.printStackTrace();
		 }
	 }

}
