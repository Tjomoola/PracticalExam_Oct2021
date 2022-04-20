package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTestTest {
  
  WebDriver driver;
	
	
	@Test
	public void validUserShouldBeAbleToCreateCustomer() {
		driver = BrowserFactory.init();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.insertUserName("demo@techfios.com");
		login.insertPassword("abc123");
		login.clickSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		dashboardPage.clickCustomerMenuBotton();
		dashboardPage.clickAddCustomerMenuBotton();
		
		
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddContactPage();
		addCustomerPage.insertFullName("Ola Olatunji");
		addCustomerPage.selectCompanyDropdown("Techfios");
		addCustomerPage.insertEmail("asdert70@yahoo.com");
		addCustomerPage.insertPhone("616-416-7997");
		addCustomerPage.insertAddress("1617 Eastern Ave");
		addCustomerPage.insertCity("Grand Rapids");
		addCustomerPage.insertState("Michigan");
		addCustomerPage.insertZip("49508");
//		addCustomerPage.selectCountryDropdown("United States");
		addCustomerPage.insertPassword("Olatunji1234");
		addCustomerPage.insertConfirmPassword("Olatunji1234");
		addCustomerPage.clickSaveButton();
		
	}
	
	@AfterClass
	public void teardown() {
	driver.close();
	driver.quit();
	
	}

}


