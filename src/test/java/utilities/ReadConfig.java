package utilities;

import java.io.File;
import java.util.Properties;
import java.io.FileInputStream;
public class ReadConfig {
	Properties pro;
	public ReadConfig()
	{
	File src=new File("./Configuration files/Config.properties");
	
	try {
		 FileInputStream fis=new FileInputStream(src);
	     pro =new Properties();
	     pro.load(fis);
	}catch (Exception e) {
		System.out.println("Exception is" + e.getMessage());
		}}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}

	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}

	
	public String getApplicationURL()
	{
		String baseurl=pro.getProperty("baseurl");
		return baseurl;
		
	}
	

	public String getnumber() {
		
		String number=pro.getProperty("number");
		return number;
	}

	
	}
	
