import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class p25_extentReports {
	
	public static void main(String[] args)
	{
		ExtentReports extent;
		ExtentTest logger;
		extent=new ExtentReports("C:\\Users\\nithish.soorya\\Desktop\\Java programs\\TestingReport\\java.html");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		System.out.println(driver.getTitle());
		driver.quit();
		logger.log(LogStatus.PASS,"Google test pass");
		extent.endTest(logger);
		extent.flush();
		extent.close();
		
	}

}
