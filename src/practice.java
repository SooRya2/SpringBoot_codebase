import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.partialLinkText("Log")).click();
		Thread.sleep(3000);
		
		WebElement fname=driver.findElement(By.id("Email"));
		fname.sendKeys("soorya");
		Thread.sleep(4000);
		driver.quit();

	}

}
