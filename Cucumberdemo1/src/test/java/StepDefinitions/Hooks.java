package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.utility.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	
	@Before("@SeleniumTest")
   public void beforevalidation() throws InterruptedException
     {
		
     

	 }
	@After("@SeleniumTest")
	public void aftervalidation()

	{
		driver.close();
	}
}
