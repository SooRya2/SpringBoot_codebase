import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p20_pageobjectmodel {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		homePage home=new homePage(driver);
		registerPage register=new registerPage(driver);
		home.clickRegister();
		register.enterFirstname("Nithish");
		register.enterlastname("Soorya"); 
		register.enteremail("sad@gmail.com");
		Thread.sleep(4000);
		driver.quit();
		
	}

}
