package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM 
{
	@FindBy(xpath = "//span[.='PIM']")
	private WebElement pim_link;
	
	
	@FindBy(xpath = "//a[.='Add Employee']")
	private WebElement add_emp;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement add_fName;
	
	@FindBy(xpath ="//input[@placeholder='Middle Name']")
	private WebElement add_MName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement add_LName;
	
	@FindBy(xpath = "//a[.='Employee List']")
	private WebElement emp_list;
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement search;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	private WebElement delete;
	
	@FindBy(xpath = "//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	private WebElement cnfm;
	
	public POM (WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	
	}
	public WebElement pim()
	{
		return pim_link;
	}
	public WebElement a_emp()
	{
		return add_emp;
	}
	public WebElement F_name()
	{
		return add_fName;
	}
	public WebElement M_name()
	{
		return add_MName;
	}
	public WebElement L_name()
	{
		return add_LName;
	}
	public WebElement e_list()
	{
		return emp_list;
	}
	public WebElement emp_search()
	{
		return search;
	}
	public WebElement emp_del()
	{
		return delete;
	}
	public WebElement emp_delcnf()
	{
		return cnfm;
	}
	
}
