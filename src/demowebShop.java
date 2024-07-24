import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//Page object factory
public class demowebShop {

	WebDriver driver;

	@FindBy(linkText="Register")
	WebElement register;
	
	@FindBy(linkText="Log in")
	WebElement login;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="FirstName")
	WebElement fname;
	
	@FindBy(id="LastName")
	WebElement lname;
	
	@FindBy(id="Password")
	WebElement pwd;
	
	demowebShop(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	void clickRegister() {
		register.click();
	}
	
	void clickLogin()
	{
		login.click();
	}
	
	void enteremail()
	{
		email.sendKeys("asds@gmail.com");;
	}
	
	void enterfirstname()
	{
		fname.sendKeys("Nithish");
	}
	
	void enterLastname()
	{
		lname.sendKeys("Soorya");
	}
	
	void enterpassword()
	{
		pwd.sendKeys("asdsad");
	}
}
