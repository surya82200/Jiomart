package Pageobject;

import java.sql.DriverPropertyInfo;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.drawingml.x2006.chart.STSecondPieSize;

import com.github.dockerjava.api.model.Driver;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;
import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class loginpage {

	WebDriver ldriver;

    public loginpage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//span[text()='Sign In']")
    WebElement clicksign;

    @FindBy(xpath ="//input[@name='phoneNumber']")
    WebElement entermobile;

   @FindBy(xpath = "//button[@aria-label='button Continue']")
   WebElement continueButton;
   
   @FindBy(xpath = "//button[@class='j-button j-button-size__medium primary j-button-flex']")
   WebElement verifyButton;
    
     public void clickSign() {
        clicksign.click();
     ldriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    
     }
    public void enterMobile(String name) {
        entermobile.sendKeys("9750475085");
	}
    public void continueButton() {   	
  	continueButton.click();
    ldriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
    
    public void verifyButton() {
    verifyButton.click();
    }
} 


 	