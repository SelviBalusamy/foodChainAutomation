package FoodChainAutomation.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import FoodChainAutomation.PageObjects.CreateProductPage;
import FoodChainAutomation.PageObjects.DownloadProductPage;
import FoodChainAutomation.PageObjects.LoginPage;
import net.bytebuddy.build.Plugin.Engine.Source.Empty;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.awt.Robot;

import java.io.IOException;
import java.io.Reader;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.format.CellTextFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.soap.Text;

 
public class CreateProductTest {

	static WebDriver driver;
	static CreateProductPage cp;
	static LoginTest login; 
	

@BeforeTest
	public void setUp() throws InterruptedException {

	cp = new CreateProductPage();

	LoginTest login = new LoginTest();

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

	WebElement product_Menu = driver.findElement(By.xpath(cp.product_Menu_Xpath));	 

	Actions action = new Actions(driver);

	action.moveToElement(product_Menu).click().build().perform();

	Thread.sleep(20000);	 

	}	 


	@Test
	public static void createProduct() throws InterruptedException, IOException, AWTException {
		/*driver.findElement(By.xpath(cp.create_Product_By_CSV_Button_Xpath)).click();
		Thread.sleep(3000);
		
		// Uploading the using AutoIT
		Runtime.getRuntime().exec("D:\\fileUpload\\fileUpload.exe");
		
		Thread.sleep(2000);
		
		// Using Robot class to handle window based pop up
		Robot r = new Robot();
		
		// Pressing Left Arrow Key
		r.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(1000);
		//releasing Left Arrow enter
		r.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(1000);		
		
		// Pressing Key
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		//releasing enter
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);		
		
		driver.findElement(By.xpath(cp.upload_Confirmation_Pop_Up_Xpath)).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(cp.close_Button_After_Upload_Xpath)).click();
		Thread.sleep(5000); */
		
		driver.findElement(By.xpath(cp.search_Item_Text_Xpath)).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(cp.search_Item_Text_Xpath)).sendKeys("neww02");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(cp.search_Item_Text_Xpath)).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(cp.first_View_Button_Xpath)).click();
		Thread.sleep(2000);
		
		String name = driver.findElement(By.xpath(cp.name_Text_Box_xpath)).getAttribute("value");
		System.out.println(name);
		
		String supplier = driver.findElement(By.xpath(cp.supplier_Text_Box_Xpath)).getAttribute("value");
		System.out.println(supplier);
		
		String category = driver.findElement(By.xpath(cp.category_Text_Box_Xpath)).getText();
		System.out.println(category);
		
		String subCategory = driver.findElement(By.xpath(cp.sub_Category_Text_Box_Xpath)).getText();
		System.out.println(subCategory);
		
		String description = driver.findElement(By.xpath(cp.description_Text_Box_Xpath)).getText();
		System.out.println(description);
		
		String supplierCode = driver.findElement(By.xpath(cp.supplier_Code_Text_Box_Xpath)).getText();
		System.out.println(supplierCode);
		
		/*String archived = driver.findElement(By.xpath(cp.archived_Check_Box_Xpath)).getText();
		System.out.println(archived);
		
		String visibleToCustomer = driver.findElement(By.xpath(cp.visible_To_Customer_Check_Box_Xpath)).getText();
		System.out.println(visibleToCustomer);*/
		
}

	//@Test
	public static void readCSV() throws IOException {
		ArrayList<Object> items = new ArrayList<Object>();
		
		String path = "D:\\CreateProductExcel\\newww.csv";
		
		// Reading the CSV using CSVReader 			
		try {
			  
	        // Create an object of filereader
	        // class with CSV file as a parameter.
	        FileReader filereader = new FileReader(path);
	  
	        // create csvReader object passing
	        // file reader as a parameter
	        CSVReader csvReader = new CSVReader(filereader);
	        String[] nextRecord;
	  
	        // we are going to read data line by line
	        while ((nextRecord = csvReader.readNext()) != null) {
	            for (String cell : nextRecord) {
	                //System.out.print(cell + "\t");
	                items.add(cell);
	            }
	            System.out.println();
	        }
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
		
		System.out.println("items are " + items);
		System.out.println(items.contains("df"));
		
	}  
	
	
	
	
	//@AfterTest
	public static void closeDriver() {
		driver.quit();
	}


}