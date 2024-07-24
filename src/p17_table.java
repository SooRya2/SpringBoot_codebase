import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p17_table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		driver.findElement(By.linkText("Enter the Store")).click();
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
		///html/body/div[2]/div[2]/table
		WebElement table=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		WebElement Table1=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[1]"));
		List<WebElement> cols=Table1.findElements(By.tagName("th"));
		Thread.sleep(3000);
		System.out.println(rows.size());
		System.out.println(cols.size());
		driver.quit();

	}

}
