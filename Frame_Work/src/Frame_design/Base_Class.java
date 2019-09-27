package Frame_design;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Base_Class {

	
	public static WebDriver driver;
	
	
	//Opening browser in a generalized way and getting its control
	@BeforeTest
	public void openBrowser()
	{
		String browser=ExcelOperation.readStringData("BaseClass",1,0);
		String url=ExcelOperation.readStringData("BaseClass",1,1);
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Drivers/chromedriver.exe");
			driver= new ChromeDriver();		
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "G:\\Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
	}

	
	//Closing the browser
	@AfterTest
	public void closeBrowser()
	{
	driver.close();
}
	
	// Logging into Acti-time application
	@BeforeClass
	public void logIn()
	{
	 String username=ExcelOperation.readStringData("BaseClass",1,2);
	 String password=ExcelOperation.readStringData("BaseClass",1,3);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	// Logging out of Acti-Time application
	@AfterClass
	public void logOut()
	{
		driver.findElement(By.className("logoutImg")).click();
	}
	
	
}
