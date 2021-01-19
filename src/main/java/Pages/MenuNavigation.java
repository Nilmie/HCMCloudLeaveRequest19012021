package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuNavigation {
	
	WebDriver driver;
	
    By ESSMenu  = By.xpath("//li[@data-tip='Self Service (ESS)']");
    By Leave=By.xpath("(//li[@id='sub-menu-23']//a)[1]");
    By LeaveRequest=By.xpath("//li[@id='sub-menu-24']//a[1]");
    
    
	public MenuNavigation(WebDriver driver)
	{
	        this.driver = driver;
	}
	 
	public void NavigateToESSMainMenu()
	{
			driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
			driver.findElement(ESSMenu).click();
	}
	public void NavigateToManageLeaveMenu()
	{
		driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		driver.findElement(Leave).click();
	}
	
	public void NavigateToLeaveRequest()
	{
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS);
		driver.findElement(LeaveRequest).click();
	}
}
