import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1_launchBrowser {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();// webdriver represents a web browser and provides methods to interact with web elements
		driver.get("http://www.google.co.in");//driver is used to control things in browser,open a new browser window  
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();
	}
}
