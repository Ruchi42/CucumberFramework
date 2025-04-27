package PageObject;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage 
{
WebDriver driver;

public LoginPage(WebDriver d)
{
	driver=d;
	PageFactory.initElements(d, this);
}
@FindBy(id= "Email") WebElement email;
@FindBy(id= "Password") WebElement password;
@FindBy(xpath= "//button[@class='button-1 login-button']") WebElement login;
@FindBy(linkText= "Logout") WebElement logout;

public void enteremail(String mail)
{
	email.clear();
	email.sendKeys(mail);
	
	}
public void enterpassword(String pwd)
{
	password.clear();
	password.sendKeys(pwd);
	
	}
public void Loginclick()
{
	login.click();
	
	}
public void Logoutclick()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	logout.click();
	
	}

}
