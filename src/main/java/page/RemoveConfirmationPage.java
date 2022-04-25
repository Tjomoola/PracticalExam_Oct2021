package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class RemoveConfirmationPage {

WebDriver driver;
	
	public void NSSTODOList(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"label-first\"]/b") WebElement NSSTODO_List_v_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]") WebElement TOGGLE_CHECK_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[3]/span") WebElement SELECTED_ITEM_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/a[1]") WebElement YES_BUTTON_ELEMENT;
	
	public void verifyNSSTODOListPage() {
		
		Assert.assertEquals(NSSTODO_List_v_HEADER_ELEMENT.getText(), "NSS-TODO List v 1.1", "NSS-TODO List v 1.1 page not found.");
			
		
	}
	
	public void clickToggleCheckBox() {
		TOGGLE_CHECK_BOX_ELEMENT.click();
		System.out.println("TOGGLE BOX CHECKED");
	}
	
	public void clickSelectedItemButton() {
		SELECTED_ITEM_BUTTON_ELEMENT.click();
		System.out.println("ITEM SELECTED");
		
	}

	
	public void clickYesButton() {
		YES_BUTTON_ELEMENT.click();
		System.out.println("ITEM REMOVED");
	}	
	}

	


