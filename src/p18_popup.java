import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p18_popup {
	 
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Incedo/popup.html");
		WebElement b=driver.findElement(By.id("one"));
		b.click();
		Thread.sleep(4000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(4000);
		driver.quit();
	}

}
