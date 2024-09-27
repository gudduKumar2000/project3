package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import generic.Generic_DDT;

public class PIMLINK extends Base_class
{

	@Test()
	public void PIM()
	{
		POM p=new POM(driver);
		p.pim().click();
		p.a_emp().click();
		p.F_name().sendKeys(Generic_DDT.read_data("Sheet2", 3, 1));
		p.M_name().sendKeys(Generic_DDT.read_data("Sheet2", 4, 1));
		p.L_name().sendKeys(Generic_DDT.read_data("Sheet2", 5, 1));
		p.e_list().click();
		p.emp_search().sendKeys(Generic_DDT.read_data("Sheet2", 3, 1),Keys.ENTER);
		
		p.emp_del().click();
		p.emp_delcnf().click();
		
//	driver.findElement(By.xpath("//span[.='PIM']")).click();  //click  on PIM
//
//	driver.findElement(By.xpath("//a[.='Add Employee']")).click(); //click on add employee
//	
//		
//	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Generic_DDT.read_data("sheet2", 3, 1));  // Enter the firstname
//	
//	driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys(Generic_DDT.read_data("sheet2", 4, 1));;   // Enter the MiddleName
//	
//	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Generic_DDT.read_data("sheet2", 5, 1 ),Keys.ENTER);   //Enter the LastName
//
//		driver.findElement(By.xpath("//a[.='Employee List']")).click();
//		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("guddu kr. saxena");
//		driver.findElement(By.xpath("//button[.=' Search ']")).click();
//		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
//		driver.findElement(By.xpath("//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
//	

}
}

