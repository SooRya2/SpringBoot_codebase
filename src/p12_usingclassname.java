import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p12_usingclassname {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		//WebElement username=driver.findElement(By.className("email"));
		WebElement username=driver.findElement(By.cssSelector("input#Email"));
		username.sendKeys("asdsad@gmaul.com");
		Thread.sleep(4000);
		driver.quit();
		
	}

}
