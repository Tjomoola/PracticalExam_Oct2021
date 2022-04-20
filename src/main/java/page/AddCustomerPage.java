package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5") WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]") WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]") WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]") WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]") WebElement ZIP_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-country-container\"]") WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cpassword\"]") WebElement CONFIRM_PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]") WebElement CLICK_SAVE_BUTTON_ELEMENT;
	
	public void verifyAddContactPage() {
		waitForElement(driver, 5, ADD_CONTACT_HEADER_ELEMENT);
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), "Add Contact", "Wrong Page!!!");
	}
	public void insertFullName(String fullname) {
		String insertedName = fullname + generateRandom(999);
		FULL_NAME_ELEMENT.sendKeys(insertedName);
}
	public void selectCompanyDropdown(String company) {
		selectFromDropdown(COMPANY_ELEMENT, company);
}
	public void insertEmail(String email) {
				EMAIL_ELEMENT.sendKeys("asdert70@yahoo.com");
	}
	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys("616-416-7997");
}
	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys("1617 Eastern Ave");
}
	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys("Grand Rapids");
}
	public void insertState(String state) {
		STATE_ELEMENT.sendKeys("Michigan");
}
	public void insertZip(String zip) {
		ZIP_ELEMENT.sendKeys("49508");
}
//	public void selectCountryDropdown(String country) {
//		selectFromDropdown(COUNTRY_ELEMENT, country);
//	}
		public void insertPassword(String password) {
			PASSWORD_ELEMENT.sendKeys("Olatunji1234");
	}
		public void insertConfirmPassword(String confirmPassword) {
			CONFIRM_PASSWORD_ELEMENT.sendKeys("Olatunji1234");
	}
		public void clickSaveButton() {
			CLICK_SAVE_BUTTON_ELEMENT.click();
	}
		
			
		}

	
	
