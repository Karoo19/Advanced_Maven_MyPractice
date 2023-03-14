package dataproviderandgrouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Dataprovider1 {

	public static WebDriver driver;
	public static SoftAssert softassert=new SoftAssert();


	@Test(dataProvider="loginData")
	public static void testLogin(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
		driver.quit();


	}

	@DataProvider
	public Object[][] loginData() {
		Object [][] data = { { "seleniumpanda@gmail.com", "Selenium@123" }, 
	                        { "seleniumpanda1@gmail.com", "Selenium@123" },
	                        { "seleniumpanda2@gmail.com", "Selenium@123" },
				            { "seleniumpanda3@gmail.com", "Selenium@1235" } };
		return data;
	}

}
