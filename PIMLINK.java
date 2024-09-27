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


}
}

