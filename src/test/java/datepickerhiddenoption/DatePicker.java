package datepickerhiddenoption;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);   //switch to frame
		
		//approche1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/21/1949");  //mm/dd/yyyy
		
		//approche2 
		//driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String year= "2023";
		String month="june";
		String date="21";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();  //will open date picker
		
		//select month & year
		
		while(true) {
		String mon= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(mon.equals(month) && yr.equals(year)) 
		{
			
		break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();    //next button
		
	    }
	
	}
}
}

