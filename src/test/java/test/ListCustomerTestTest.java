package test;

import org.openqa.selenium.WebDriver;import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.ListCustomerPage;
import page.LoginPage;
import util.BrowserFactory;


public class ListCustomerTestTest {
	WebDriver driver;

		@Test
		public void validUserShouldBeAbleToListCustomer() {
			driver = BrowserFactory.init();
			
			
			
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			login.insertUserName("demo@techfios.com");
			login.insertPassword("abc123");
			login.clickSigninButton();
			
			DashboardPage dashboardPage = (DashboardPage) PageFactory.initElements(driver, DashboardPage.class);
			dashboardPage.verifyDashboardPage();
			dashboardPage.clickCustomerMenuBotton();
			dashboardPage.clickListCustomerMenuBotton();
			
			
			ListCustomerPage contactsPage = PageFactory.initElements(driver, ListCustomerPage.class);
			contactsPage.verifyListCustomerPage();
			contactsPage.insertIntoSearch("Ola Olatunji");
			
				
			}
		
	}

