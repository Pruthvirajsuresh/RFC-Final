package com.sto.Config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.sto.maincode.Sto;

public class Properties2File {
static Properties prop2 = new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		
	}

	 public static void readPropertiesFile() {
		 
		 try 
		 {
			 
			InputStream input = new FileInputStream("/home/infibeam/eclipse-workspace/STOprocess/src/com/sto/Config/Config2.properties");
		    prop2.load(input);
		    Sto.browser = prop2.getProperty("browser");
		    Sto.seller_name = prop2.getProperty("seller_name");
		    Sto.seller_pwd = prop2.getProperty("seller_pwd");
		    Sto.STR_NUM = prop2.getProperty("STR_NUM");
		    Sto.confirm_qty = prop2.getProperty("confirm_qty");
		    Sto.MRP = prop2.getProperty("MRP");
		    Sto.product_length = prop2.getProperty("product_length");
		    Sto.product_breath = prop2.getProperty("product_breath");
		    Sto.product_height = prop2.getProperty("product_height");
		    Sto.Year = prop2.getProperty("Year");
		    Sto.Year = prop2.getProperty("Month");
		    Sto.Year = prop2.getProperty("Day");
		    Sto.package_length = prop2.getProperty("package_length");
		    Sto.package_breath = prop2.getProperty("package_breath");
		    Sto.package_height = prop2.getProperty("package_height");
		    Sto.package_weight = prop2.getProperty("package_weight");
		    Sto.Eaches = prop2.getProperty("Eaches");
		    Sto.packageno = prop2.getProperty("packageno");
		    Sto.BOXWEIGHT = prop2.getProperty("BOXWEIGHT");
		    Sto.box_length = prop2.getProperty("box_length");
		    Sto.box_breath = prop2.getProperty("box_breath");
		    Sto.box_height = prop2.getProperty("box_height");
		    Sto.AppointmentDate = prop2.getProperty("AppointmentDate");
		    Sto.Time_slot = prop2.getProperty("Time_slot");
		    
		 } 
		 
		 catch (Exception e) 
		 {
			
			e.printStackTrace();
		 }
	 }

}


