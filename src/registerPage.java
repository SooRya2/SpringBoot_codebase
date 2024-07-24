import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//pageobjectmodel
public class registerPage {
	
	WebDriver driver;
	WebElement fname,lname,email;
	
	registerPage(WebDriver driver)
	{
		this.driver=driver;
	}

	void enterFirstname(String s)
	{
		fname=driver.findElement(By.id("FirstName"));
		fname.sendKeys(s);
		
	}
	
	void enterlastname(String s)
	{
		lname=driver.findElement(By.id("LastName"));
		lname.sendKeys(s);
	}
	
	void enteremail(String s)
	{
		email=driver.findElement(By.id("Email"));
		email.sendKeys(s);
	}
}
