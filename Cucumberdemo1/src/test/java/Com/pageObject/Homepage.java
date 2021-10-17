package Com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Com.utility.Base;

public class Homepage  {
	
	public static WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
   By search=By.xpath("//input[@type='search']");
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	
	
	
	
	
	
	
}
