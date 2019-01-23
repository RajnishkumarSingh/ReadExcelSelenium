package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdefs {
	public static WebDriver driver;
	@Given("^The login url of the demo app$")
	public void the_login_url_of_the_demo_app()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@When("^user enters (.*) as username$")
	public void user_enters_askmail_email_com_as_username(String username)  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	
	@When("^User enters (.*) as pwd$")
	public void user_enters_abc_as_password(String pwd)  {
	    // Write code here that turns the phrase above into concrete actions
		WebElement password =driver.findElement(By.id("Password"));
        password.sendKeys(pwd);
	   
	}
	
	@When("^clicks on login$")
	public void clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click(); 
	   
	}
	
	@Then("^user is (valid|invalid)$")
	public void user_is_valid() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
}
