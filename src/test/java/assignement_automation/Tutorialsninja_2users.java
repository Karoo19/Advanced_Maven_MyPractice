package assignement_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorialsninja_2users {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://tutorialsninja.com/demo/");

		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("karoo");
		driver.findElement(By.id("input-lastname")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("karima16@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("12312312345");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Karima@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Karima@123");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("karima101@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Karima@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Edit your account information']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	

	}

}
