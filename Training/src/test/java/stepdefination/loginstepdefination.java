package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefination {
	//WebDriver driver;
	PageObjects p;
	@SuppressWarnings("depreciation")
	@Given("Navigate to Home")
	public void navigate_to_Home() 
	{
	System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 p=new PageObjects(driver);
		 Common.LaunchBrowser();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		p.signin.click();
		p.username.sendKeys("Lalitha");
		p.password.sendKeys("Password123");
		p.Login.click();
		Common.login();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
		System.out.println("user logged in successfully");
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("Larry has register into testmeapp")
	public void larry_has_register_into_testmeapp() {
		Common.LaunchBrowser();
		Common.login();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@When("Larry increase the headphone quantity by {int}")
	public void larry_increase_the_headphone_quantity_by(Integer int1) {
		Common.productselect();
		String newvalue=Integer.toString(int1);
		p.quantity.sendKeys(Keys.chord(Keys.CONTROL));
		p.quantity.sendKeys(newvalue);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@When("continue for checkout")
	public void continue_for_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("change the shipping address to a address as {string}")
	public void change_the_shipping_address_to_a_address_as(String string) {
		p.checkbox.click();
		p.testbox.sendKeys("Pune");
		p.Proceedtopay.click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(p.selectbank));
		p.selectbank.click();
		p.continu.click();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("the product should be delivered to the new address")
	public void the_product_should_be_delivered_to_the_new_address() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
}
}
