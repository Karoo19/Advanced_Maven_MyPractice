package parallelTestingandinvocation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//1)create test case
//2) create xml file to run test
//3)pass browser name parameter from xml to setup() method
//4)execute test case on chrome & edge (serial execution)
//5)execute test case on chrome & edge (parallel execution)
public class ParamTesting {

	WebDriver driver;

	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br, String appurl) throws InterruptedException {

		if(br.equals("chrome"))
		{
			driver= new ChromeDriver();
		}else if(br.equals("edge"))
		{
			
			driver=new EdgeDriver();
		}else {
			driver=new FirefoxDriver();
		}
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(appurl);
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	@Test(priority = 1)
	void testLogo()
	    {
		try 
		{

			boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			Assert.assertEquals(status, true);
		} 
		catch (Exception e) 
		{
			Assert.fail();
		}

	}

	@Test(priority = 2)
	void testHomePage() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM", "title are not matched...");

	}

	@AfterClass
	void closeApp() {
		driver.quit();

	}

}
