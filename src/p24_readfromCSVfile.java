import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p24_readfromCSVfile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String datafile="C:\\Incedo\\testdata.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine()) !=null)
		{
			String[] data=line.split(cvsSplitBy);
			WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("FirstName")).sendKeys(data[0]);
			driver.findElement(By.id("LastName")).sendKeys(data[1]);
			driver.findElement(By.id("Email")).sendKeys(data[2]);
			Thread.sleep(5000);
			driver.quit();
		}

				

	}

}
