import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popularitems_module {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://advantageonlineshopping.com/#/");
		driver.findElement(By.xpath("//*[@id=\"details_16\"]")).click();
		Thread.sleep(5000);
		driver.quit();

}
}