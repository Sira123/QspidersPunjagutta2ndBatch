package Frame_design;

import org.testng.annotations.Test;

public class Createproject  extends Base_Class{

	@Test
	public void testCreateProject()
	{
	
		//Step1 fetch test data from excel 
		String customerName=ExcelOperation.readStringData("CreateProject", 1, 0);
		String  projectName=ExcelOperation.readStringData("CreateProject", 1, 1);
		String  expectedResult=ExcelOperation.readStringData("CreateProject", 1, 2);
		
		//Step2 convert test case into test script
		
		OpenTaskPage otp= new OpenTaskPage();
		otp.clickOnProjectsAndCustomerLink();
		
		ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
		apcp.clickOnAddNewProjectButton();
		
		AddNewProjectPage anpp = new AddNewProjectPage();
		anpp.selectCustomerNameFromDropdown(customerName);
		anpp.enterProjectNameinProjectNameTextField(projectName);
	    anpp.clickOnCreateProjectButton();
		
		String actualResult=apcp.retriveSuccessMessage();
		
		
		//step 3 validate test script
		String status=Validation_Operation.validatingTestScript(actualResult, expectedResult);
		
		//Step4  write data into excel
		 ExcelOperation.writeStringData("CreateProject", 1, 3, actualResult);
		 ExcelOperation.writeStringData("CreateProject", 1, 4, status);
	}
}		
		 
		
		
		
	