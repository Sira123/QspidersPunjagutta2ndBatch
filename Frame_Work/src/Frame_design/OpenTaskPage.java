package Frame_design;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTaskPage {
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projectsAndCustomerLink;
	
	
	public OpenTaskPage()
	{
		PageFactory.initElements(Base_Class.driver, this);
		
	}
	
	public void clickOnProjectsAndCustomerLink()
	{
		
		projectsAndCustomerLink.click();
		
	}

	
	
	
	
	
	
	
	
	
	
	
}










