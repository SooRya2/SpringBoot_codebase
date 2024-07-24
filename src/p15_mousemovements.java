import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p15_mousemovements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement computer=driver.findElement(By.xpath("//a[@href='/computers']"));
		Actions actions=new Actions(driver); //Action is a keyword
		actions.moveToElement(computer).build().perform();//opens the items inside computer element
		Thread.sleep(2000);
		WebElement notebooks=driver.findElement(By.linkText("Notebooks"));
		notebooks.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
