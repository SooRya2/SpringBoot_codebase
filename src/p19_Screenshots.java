import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class p19_Screenshots {

	static int i=1;
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
	
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("firstname");
		driver.findElement(By.id("LastName")).sendKeys("lastname");
		screenshot();
		driver.quit();

	}
	
	static void screenshot() throws IOException
	{
		File scrFile;
		scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(scrFile, new File("C:\\Incedo\\Screenshots" + i + ".jpeg"));
		i++;	
	
	}

}
