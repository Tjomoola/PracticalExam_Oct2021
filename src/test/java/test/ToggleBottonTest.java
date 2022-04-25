package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import page.RemoveConfirmationPage;
import page.NSSTODOListPage;
import util.BrowserFactory;

public class ToggleBottonTest {

	  WebDriver driver;
		
		
	  @Test
		public void UserShouldBeAbleToClickToggleButton() {
			driver = BrowserFactory.init();
			
			
			
			NSSTODOListPage nsstodolistPage = PageFactory.initElements(driver, NSSTODOListPage.class);
			nsstodolistPage.verifyNSSTODOListPage();
			nsstodolistPage.clickToggleCheckBox();
			nsstodolistPage.clickSelectedItemButton();
				
		}
		
			
		  @Test
			public void UserShouldBeableToRemoveSingleListItem() {
				driver = BrowserFactory.init();
				
				
				
				RemoveConfirmationPage removeConfirmationPage = PageFactory.initElements(driver, RemoveConfirmationPage.class);
				removeConfirmationPage.clickYesButton();
					
			}
		
			
		
		@AfterClass
		public void teardown() {
		driver.close();
		driver.quit();
		
		}

	}



	


