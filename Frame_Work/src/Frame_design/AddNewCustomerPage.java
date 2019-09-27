package Frame_design;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	
	@FindBy(name="name")
	private WebElement customerNameTextField;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	
	
	public AddNewCustomerPage()
	{
		PageFactory.initElements(Base_Class.driver,this);
	}
	
	public void enterCustomerNameinCustomerNameTextField(String customerName)
	{
		customerNameTextField.sendKeys(customerName);
	}
	
	public void clickOnCreateCustomerButton() {
		
		
		createCustomerButton.click();
	}

}







