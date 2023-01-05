package FoodChainAutomation.test;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

 

import FoodChainAutomation.PageObjects.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest extends LoginPage {
	
	static WebDriver driver;	 

	public WebDriver initializer() {	 

	WebDriverManager.chromedriver().setup();

	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SelviBalusamy\\\\Downloads\\\\chromedriver\\\\chromedriver.exe");

	driver = new ChromeDriver();	 

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);

	return driver; 

	} 

	public void login() throws InterruptedException { 

	driver = initializer();	 

	driver.get("https://application.joinfoodchain.com/");

	String email = "Ruchin.Kansal@benthonlabs.com";

	String password = "key.chain.lion12";	 

	driver.findElement(By.xpath(LoginPage.email_Name)).click();

	driver.findElement(By.xpath(LoginPage.email_Name)).sendKeys(email);	 

	Thread.sleep(1000);	 

	driver.findElement(By.xpath(LoginPage.password_Name)).click();

	driver.findElement(By.xpath(LoginPage.password_Name)).sendKeys(password);	 

	Thread.sleep(2000); 

	driver.findElement(By.xpath(LoginPage.sign_in_xpath)).click();	 

	Thread.sleep(10000);

	}

}



 





 