package Frame_design;

import org.testng.annotations.Test;

public class CreateCustomer extends Base_Class
{
  @Test
  public void testCreateCustomer()
  {
	 //step 1: fetch test data from excel
	 
	 String customerName=ExcelOperation.readStringData("CreateCustomer",1,0);
	 String expectedResult=ExcelOperation.readStringData("CreateCustomer",1,1);
	  //step 2:convert test case into testscript
	  OpenTaskPage otp=new OpenTaskPage();
	otp.clickOnProjectsAndCustomerLink();		
	 
	ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
	apcp.clickOnAddNewCustomerButton();
	
	AddNewCustomerPage ancp=new AddNewCustomerPage();
	ancp.enterCustomerNameinCustomerNameTextField(customerName);
	ancp.clickOnCreateCustomerButton();
	
	String actualResult=apcp.retriveSuccessMessage();
	
   //Step 3  validate testscript	
	
	String status =Validation_Operation.validatingTestScript(actualResult, expectedResult);
	
	//step4 write actual result and status in excel
	ExcelOperation.writeStringData("CreateCustomer",1,2,actualResult);
	ExcelOperation.writeStringData("CreateCustomer",1,3,status);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
	  
  }
	
	
	
}
