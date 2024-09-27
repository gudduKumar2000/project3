package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import generic.Generic_DDT;

      
public class Base_class
{
	public WebDriver driver;
	 @BeforeClass
	 public void open()
	 {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com");	
    }
	 @BeforeMethod
	 public void login()
	 {
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Generic_DDT.read_data("Sheet2", 0, 1)); //enter username 

			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Generic_DDT.read_data("Sheet2", 2, 1));    //enter pwd
			driver.findElement(By.xpath("//button[.=' Login ']")).click();                     //click on login
		
	 }
	 
	 @AfterMethod
	 public void close()
	 {
		 driver.quit();
	 }
	 

}
