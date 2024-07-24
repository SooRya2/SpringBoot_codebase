import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p9_combobox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/#");
		driver.findElement(By.linkText("Automobile")).click();
		//The Select class in Selenium is used for interacting with dropdown elements (<select> tags) on web pages.
		Select make=new Select(driver.findElement(By.name("Make")));// make is the field in the application
	    Thread.sleep(5000);
		int total=make.getOptions().size();//getting no of options in make dropdown
		System.out.println("Total values"+total);
		//make.selectByVisibleText("Suzuki"); // Selects suzuki in the make field
		for(int i=0;i<total;i++)
		{
			make.selectByIndex(i); // selects everything in the make field
			Thread.sleep(2000);
		}
		
		driver.quit();

	}

}
