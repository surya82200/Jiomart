package testcases;
import org.testng.annotations.Test;
import Pageobject.loginpage;




	public class  Testcase001 extends baseclass{

		@Test

		public void loginTest() throws InterruptedException {

			loginpage lp = new loginpage(driver);
			logger.info("URL is opened");
			Thread.sleep(1000);
           
        	lp.clickSign();
   			logger.info("sign in clicked");
   			Thread.sleep(3000);
   			System.out.println("check  print");
		
			

			lp.enterMobile(number);
			logger.info("phonebox clicked and Entered the phonenumber");
			Thread.sleep(3000);
			
			lp.continueButton();
			Thread.sleep(3000);
			
			lp.verifyButton();
			Thread.sleep(3000);

		}
	}


