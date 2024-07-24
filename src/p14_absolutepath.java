import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p14_absolutepath {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		//WebElement register=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));//absolute path for register element
		//WebElement register=driver.findElement(By.xpath("//a[@href='/register']")); //relative path for register
		WebElement register=driver.findElement(By.xpath("//*[contains(@href,'/register')]")); //another way to find relative path
		register.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
