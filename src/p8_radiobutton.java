import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8_radiobutton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();// webdriver represents a web browser and provides methods to interact with web elements
		driver.get("http://demowebshop.tricentis.com");//driver is used to control things in browser,open a new browser window  
		WebElement register=driver.findElement(By.linkText("Register"));
		register.click();
		WebElement male=driver.findElement(By.id("gender-male"));
		male.click();
		Thread.sleep(5000);
		WebElement female=driver.findElement(By.id("gender-female"));
		female.click();
		Thread.sleep(5000);
		driver.quit();

	}

}
