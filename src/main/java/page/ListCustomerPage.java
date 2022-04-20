package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

	public class ListCustomerPage extends BasePage {
	
		WebDriver driver;
			
			public ListCustomerPage(WebDriver driver) {
				this.driver = driver;
				
			}
			
			@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/a[1]") WebElement ADD_CUSTOMER_ELEMENT;
			@FindBy(how = How.XPATH, using = "//*[@id=\"foo_filter\"]") WebElement SEARCH_ELEMENT;

			public void verifyListCustomerPage() {
				// TODO Auto-generated method stub
				
			}

			public void insertIntoSearch(String fullname) {
				String insertedName = fullname + generateRandom(999);
				SEARCH_ELEMENT.sendKeys(insertedName);
				
			}

			
					
				
				
				
			}
				

