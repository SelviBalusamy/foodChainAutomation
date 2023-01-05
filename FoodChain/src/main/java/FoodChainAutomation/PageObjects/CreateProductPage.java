package FoodChainAutomation.PageObjects;

public class CreateProductPage {
	public String product_Menu_Xpath = "//div[text()='Products']";
	
	public String create_Product_By_CSV_Button_Xpath = "(//button[@type='button'])[1]";
	
	public String first_View_Button_Xpath = "(//span[text()='VIEW'])[1]";
	
	public String name_Text_Box_xpath = "(//div[text()='Name:']//parent::fieldset//input)[1]";
	
	public String supplier_Text_Box_Xpath = "(//div[text()='Supplier:']//parent::fieldset//div//input)[1]";
	
	public String category_Text_Box_Xpath = "(//div[text()='Category:']//parent::fieldset//div//button)[1]";
	
	public String sub_Category_Text_Box_Xpath = "(//div[text()='Subcategory:']//parent::fieldset//div//button)[1]";
	
	public String description_Text_Box_Xpath = "//div[text()='Description:']//parent::fieldset//textarea[1]";
	
	public String supplier_Code_Text_Box_Xpath = "//div[text()='Supplier product code:']//parent::fieldset//input[1]";
	
	public String archived_Check_Box_Xpath = "//div[text()='Archived:']//parent::fieldset//input[1]";
	
	public String visible_To_Customer_Check_Box_Xpath = "//div[text()='Visible to consumers:']//parent::fieldset//input[1]";
	
	public String close_View_Button_Xpath = "//button[text()='✕']";
	
	//String archived_Check_Box_Xpath = "//button[text()='✕']";
	
	public String upload_Confirmation_Pop_Up_Xpath = "//button[text()='Yes']";
	
	public String download_Failed_Product_Xpath = "//button[text()='Download Failed Products']";
	
	public String search_Item_Text_Xpath = "//input[starts-with(@class,'FiltersBar_item')]";
	
	public String close_Button_After_Upload_Xpath = "//button[text()='Close']";
}
