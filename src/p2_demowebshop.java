import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2_demowebshop {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver(); // using java program to launch the browser and launch the application
		driver.get("http://demowebshop.tricentis.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
