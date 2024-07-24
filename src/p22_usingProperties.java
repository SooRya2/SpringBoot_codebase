

//using properties...we declared a file called obj.propertie earlier

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p22_usingProperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties obj=new Properties();
		FileInputStream objfile=new FileInputStream("C:\\Users\\nithish.soorya\\Desktop\\Java programs\\SeleniumDemo\\obj.properties");
		obj.load(objfile);
		String register=obj.getProperty("register");
		String fname=obj.getProperty("fname");
		String lname=obj.getProperty("lname");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText(register)).click();
		driver.findElement(By.id(fname)).sendKeys("asd");
		driver.findElement(By.id(lname)).sendKeys("Abc");
		Thread.sleep(4000);
		driver.quit();
	}

}
