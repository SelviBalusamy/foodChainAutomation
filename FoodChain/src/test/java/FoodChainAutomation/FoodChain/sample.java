package FoodChainAutomation.FoodChain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		first();

	}
	
	public static void first() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SelviBalusamy\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	
	

}
