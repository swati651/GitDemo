package StepDefinitions;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Com.pageObject.Homepage;
import Com.utility.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepdef {
	public static WebDriver driver;
	Homepage h;
	@Given("user is on Greencart landing page")
	public void user_is_on_landing_page() throws InterruptedException, IOException 
	{
		driver=Base.getdriver();
		Thread.sleep(3000);

	}

	@When("^user searched for (.+) vegetable$")
	public void user_searched_for_something_vegetable(String Vegname) throws Throwable {
		h=new Homepage(driver);
		h.getSearch().sendKeys(Vegname);

		Thread.sleep(3000);
	}

	@Then("{string} results are displayed")
	public void results_are_displayed(String Vegname) throws InterruptedException {

		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(Vegname));
		Thread.sleep(2000);

	}

	@Then("^Verify selected (.+) items are displayed in check out page$")
	public void verify_selected_items_are_displayed_in_check_out_page(String Vegname) throws Throwable {
		Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(Vegname));


	}

	@And("^item to added to cart$")
	public void item_to_added_to_cart() throws Throwable {
		driver.findElement(By.cssSelector("a.increment")).click();
		driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	}

	@And("^User proceeded to check out page for purchase$")
	public void user_proceeded_to_check_out_page_for_purchase() throws Throwable {

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(2000);


	}



	@Then("click on place order and proceed")
	public void click_on_place_order_and_proceed() throws Throwable {

		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(2000);


	}

	@Then("Order placed successfully")
	public void order_placed_successfully() throws Throwable {
		System.out.println("order get successfully");

	}


}
