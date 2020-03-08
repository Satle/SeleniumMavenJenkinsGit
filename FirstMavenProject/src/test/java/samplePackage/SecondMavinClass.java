package samplePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondMavinClass {
	
	@Test
	public void test2() {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/* ******* this wait will apply to all the element associated to this driver. ***** */
		driver.get("http://sampleapp.tricentis.com/102/app.php");
		driver.findElement(By.xpath("//div[@class='main-navigation']//a[@id='nav_automobile']")).click();
		System.out.println("*************Testing Second Mavin class");
		//************* Date of Manufacture ********//
		driver.findElement(By.xpath("//button[@title = 'Open Date of Manufacture Calender']")).click();

 
	}

}
