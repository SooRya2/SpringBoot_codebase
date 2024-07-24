import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4_clicklinkLogin {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com"); // driver is used for launching the application
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		Thread.sleep(5000);
		driver.quit();

	}
}
