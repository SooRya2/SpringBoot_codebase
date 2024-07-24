import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p16_keyboard {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement register=driver.findElement(By.linkText("Register"));
		register.click();
		WebElement fname=driver.findElement(By.id("FirstName"));
		fname.sendKeys("abcdef");
		fname.sendKeys(Keys.CONTROL,"a");
		fname.sendKeys(Keys.CONTROL,"c");
		WebElement lname=driver.findElement(By.id("LastName"));
		lname.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(5000);
		driver.quit();
	}
}
