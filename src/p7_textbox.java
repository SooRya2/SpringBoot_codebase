import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p7_textbox {
	
	public static void main(String[] args) throws InterruptedException//entering some value into textbox and also reading the value
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com"); // driver is used for launching the application
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement username=driver.findElement(By.id("Email")); // checking email and typing a email
		username.sendKeys("abcdef");
		String s=username.getAttribute("value");//the "value"  typically represents the text entered into the field.
		System.out.println(s);
		Thread.sleep(5000);
		driver.quit();
		
	}

}
