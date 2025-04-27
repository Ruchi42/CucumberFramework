package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef
{
	public LoginPage l; //create loginpage class object
	public WebDriver driver; //create WebDriver class object
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser()
	{
		WebDriverManager.chromedriver().setup();//launch browser
		driver= new ChromeDriver();
		l= new LoginPage(driver); //pass webdriver object    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String URL)
	{
	    driver.get(URL);
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password)
	{
		l.enteremail(email);
		l.enterpassword(password);
	}

	@When("Click on Login")
	public void click_on_login()
	{
	    l.Loginclick();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expected_title)
	{
	    String actual_title= driver.getTitle();
	    System.out.println("Actual Title = " + actual_title);
	    if(actual_title.equals(expected_title))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }    
	}

	@When("User clicks on Logout link")
	public void user_clicks_on_logout_link()
	{
		l.Logoutclick(); //call logout method from page object class
	}

	@Then("Page Title should be shown as {string}")
	public void page_title_should_be_shown_as(String Login_title)
	{
		String actual_title= driver.getTitle();
		System.out.println("Actual Title = " + actual_title);
	    if(actual_title.equals(Login_title))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }    
	}

	@Then("close browser")
	public void close_browser()
	{
	    driver.close();
	    driver.quit();
	   
	}



}
