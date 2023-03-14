package assignement_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Tutorialsninja_5users4 {

	public static WebDriver driver;
	public static ChromeDriver driver1;
	public static ChromeOptions options;

	public static void main(String[] args) {

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
	    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start--maximize");
		options.addArguments("--incognito");
		
		//WebDriverManager.chromedriver().browserVersion("111.0.5563.19").setup();
		//chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\browser driver\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");

		DesiredCapabilities cp=new DesiredCapabilities();

		cp.setCapability(ChromeOptions.CAPABILITY, options);

		options.merge(cp);

		 driver = new ChromeDriver(options);
		 
		/*WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		//WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("http://tutorialsninja.com/demo/");
		
		//options.addArguments("--remote-allow-origins=*"); */

		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("karoo");
		driver.findElement(By.id("input-lastname")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("karima18@gmail.com");
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
