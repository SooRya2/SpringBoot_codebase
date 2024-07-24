import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10_partiallink {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.triceentis.com");
		//This locator finds anchor elements (<a>) by a portion of their visible text.
		WebElement link=driver.findElement(By.partialLinkText("Log")); //For static link we use LinkText..for dynamic link we use partialLinktext
		link.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
