package FoodChainAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DownloadProductPage {

	 public String product_Menu_Xpath = "//div[text()='Products']";

	 public String enter_Filter_Supplier_Id = "(//input[starts-with(@id,'downshift')])[1]";    

	 public String search_supplier_value_xpath = "//div[@class='SupplierChooser_main-9d']//div[text()='Test Supplier 1']";

	 public String download_Button_xpath = "//button[text()='Download CSV']";

	 public String restaurant_SearchBox_xpath = "(//input[starts-with(@id,'downshift')])[2]";

	 public String check_All_Product_Xpath = "(//label[@class='ProductsTable_cell-ae'])[1]//input[1]";

	 public String first_Product_Check_Box_Xpath = "(//label[@class='ProductsTable_cell-ae'])[2]//input[1]";

	 public String create_Product_By_CSV_Xpath = "(//button[@type='button'])[1]";

	 public String close_Button_Xpath = "//button[text()='Close']";
}
