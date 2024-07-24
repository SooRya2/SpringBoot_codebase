import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5_EnteringtestinTextbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com"); // driver is used for launching the application
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.id("Email")); // checking email and typing a email
		//username.sendKeys("abcdef");
		Thread.sleep(5000);
		WebElement rememberme=driver.findElement(By.id("RememberMe"));
		Boolean result=rememberme.isSelected();
		System.out.println("Remember me selected condition="+result);
		rememberme.click();
		Boolean resu=rememberme.isSelected();
		System.out.println("Remember me after clicking is="+resu);
		Thread.sleep(5000);
		driver.quit();
	}

}
