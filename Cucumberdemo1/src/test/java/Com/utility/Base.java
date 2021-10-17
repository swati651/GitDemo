package Com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static WebDriver getdriver() throws InterruptedException, IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\SWMARE\\Practice-workspace\\Cucumberdemo1\\src\\test\\java\\Com\\properties\\global.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "C:/Users/SWMARE/Practice-workspace/Cucumberdemo1/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
	
}

