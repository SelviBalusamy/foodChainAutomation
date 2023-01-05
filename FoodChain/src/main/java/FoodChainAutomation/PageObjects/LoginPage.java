package FoodChainAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 WebDriver driver;

     public static String email_Name = "//input[@name='email']";
     public static String password_Name = "//input[@name='password']";
     public static String sign_in_xpath = "//button[text()='Sign In']";
}
