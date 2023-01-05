package FoodChainAutomation.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FoodChainAutomation.PageObjects.*;
import FoodChainAutomation.PageObjects.LoginPage;
import FoodChainAutomation.PageObjects.DownloadProductPage;
import FoodChainAutomation.test.*;

public class DownloadProductTest  extends DownloadProductPage{

	static WebDriver driver;
	static DownloadProductPage dp;
	static LoginTest login; 
	
@BeforeTest
	public void setUp() throws InterruptedException {

	dp = new DownloadProductPage();

	LoginTest login = new LoginTest();

	//driver = login.initializer();

	//login.login();

	driver = login.initializer();	 

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

	// Go to Product Menu	 

	WebElement product_Menu = driver.findElement(By.xpath(dp.product_Menu_Xpath));	 

	Actions action = new Actions(driver);

	action.moveToElement(product_Menu).click().build().perform();

	Thread.sleep(20000);	 

	}	 

	@Test

	public void download_Bulk_CSV_By_Filtering_Supplier() throws InterruptedException {	 

	// Filter by Supplier Value
	driver.findElement(By.xpath(dp.enter_Filter_Supplier_Id)).click();

	Thread.sleep(2000);

	String supplierName = "Udale Speciality Foods";	 

	driver.findElement(By.xpath(dp.enter_Filter_Supplier_Id)).sendKeys(supplierName);	 

	driver.findElement(By.xpath(dp.enter_Filter_Supplier_Id)).sendKeys(Keys.DOWN);

	Thread.sleep(2000);	 

	driver.findElement(By.xpath(dp.enter_Filter_Supplier_Id)).sendKeys(Keys.ENTER);

	Thread.sleep(2000);	 

	// Click on Download
	driver.findElement(By.xpath(dp.download_Button_xpath)).click();

	Thread.sleep(6000);	 

	// Click on Close
	driver.findElement(By.xpath(dp.close_Button_Xpath)).click();

	Thread.sleep(2000);	 

	// Clearing Supplier Filter Value 
	driver.findElement(By.xpath(dp.enter_Filter_Supplier_Id)).click();

	Thread.sleep(2000);	 

	driver.findElement(By.xpath(dp.enter_Filter_Supplier_Id)).sendKeys(Keys.CONTROL + "a");

	Thread.sleep(1000);

	driver.findElement(By.xpath(dp.enter_Filter_Supplier_Id)).sendKeys(Keys.BACK_SPACE);

	Thread.sleep(1000);

	}

	 

	@Test(dependsOnMethods="download_Bulk_CSV_By_Filtering_Supplier()")

	public void download_CSV_By_Filtering_Restaurant() throws InterruptedException {	 

	// Filter by Restaurant

	driver.findElement(By.xpath(dp.restaurant_SearchBox_xpath)).click();
	
	Thread.sleep(2000); 
	
	String restaurantName = "benthonlabs.com";	 

	driver.findElement(By.xpath(dp.restaurant_SearchBox_xpath)).sendKeys(restaurantName);

	Thread.sleep(2000);
	 
	driver.findElement(By.xpath(dp.restaurant_SearchBox_xpath)).sendKeys(Keys.DOWN);

	Thread.sleep(2000);	 

	driver.findElement(By.xpath(dp.restaurant_SearchBox_xpath)).sendKeys(Keys.ENTER);

	Thread.sleep(2000);	 

	// Click on First Check Box

	driver.findElement(By.xpath(dp.check_All_Product_Xpath)).click();

	Thread.sleep(2000);	 

	// Click on Download

	driver.findElement(By.xpath(dp.download_Button_xpath)).click();

	Thread.sleep(4000);	 

	// Click on Close

	//driver.findElement(By.xpath(dp.close_Button_Xpath)).click();

	//Thread.sleep(2000);	 

	// Clearing Restaurant Filter

	driver.findElement(By.xpath(dp.restaurant_SearchBox_xpath)).click();

	Thread.sleep(2000);	 

	driver.findElement(By.xpath(dp.restaurant_SearchBox_xpath)).sendKeys(Keys.CONTROL + "a");

	Thread.sleep(1000);

	driver.findElement(By.xpath(dp.restaurant_SearchBox_xpath)).sendKeys(Keys.BACK_SPACE);

	Thread.sleep(1000);
	}	 

	@Test(dependsOnMethods="download_CSV_By_Filtering_Restaurant()")

	public static void download_bulk_CSV() throws InterruptedException {	 

	// Download that selected product	 

	driver.findElement(By.xpath(dp.download_Button_xpath)).click();

	Thread.sleep(2000);

	}	 

	@Test(dependsOnMethods="download_bulk_CSV()")

	public static void download_Single_CSV() throws InterruptedException, IOException {	 

	// Un-Select all Check_Box

	driver.findElement(By.xpath(dp.check_All_Product_Xpath)).click();

	Thread.sleep(2000);	 

	// Select the first product on this page 

	driver.findElement(By.id(dp.first_Product_Check_Box_Xpath)).click();

	Thread.sleep(2000);	 

	// Download that selected product 

	driver.findElement(By.xpath(dp.download_Button_xpath)).click();

	Thread.sleep(2000);	 

	}	 

	@AfterTest

	public static void close() {

	driver.quit();

	}
}
