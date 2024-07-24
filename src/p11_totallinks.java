import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11_totallinks {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int total=links.size();
		System.out.println(total);
		driver.quit();
	}

}
