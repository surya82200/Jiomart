package testcases;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Pageobject.loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;

		public class baseclass {
			loginpage lp ;
			ReadConfig readconfig=new ReadConfig();
			
			public String baseurl=readconfig.getApplicationURL();
			//public String mail=readconfig.mobile();
			
			public String number=readconfig.getnumber();
			
			
			
		
			
			public static WebDriver driver;
			
			public static Logger logger;
			
			
			@BeforeClass
			@Parameters("browser")
			public void setup(String br) throws InterruptedException
			{			
				logger = Logger.getLogger("Jiomart");
				PropertyConfigurator.configure("log4j.properties");
				
				if(br.equals("chrome"))
				{
					logger.info("chrome is starting");
					//System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
				}
				
				else if(br.equals("firefox"))
					
				{

					//WebDriverManager.firefoxdriver().setup();
					System.setProperty("webdriver.firefox.driver",readconfig.getFirefoxPath());
			        driver = new FirefoxDriver();
					}
				else if(br.equals("ie"))
				{

					//WebDriverManager.iedriver().setup();
					System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			        driver = new InternetExplorerDriver();
					}
				
				Thread.sleep(30);
				driver.get(baseurl);
				driver.manage().window().maximize();
				logger.info("url is opening");
				lp = new loginpage(driver);
				lp.clickSign();
				lp.enterMobile(number);
			    lp.continueButton();
				lp.verifyButton();
			}
			
			@AfterClass
			public void tearDown()
			{
				//driver.quit();
			}
			
			public void captureScreen(WebDriver driver, String tname) throws IOException {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
				FileUtils.copyFile(source, target);
				System.out.println("Screenshot taken");
			}
			
			
			
		
			

	// TODO Auto-generated method stub
			
	}