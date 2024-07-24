import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p21_pageobjectfactory {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		demowebShop demo=new demowebShop(driver);
		demo.clickRegister();
		//demo.clickLogin();
		demo.enteremail();
		demo.enterfirstname();
		demo.enterLastname();
		//demo.enterpassword();

		Thread.sleep(4000);
		driver.quit();
	}

}
