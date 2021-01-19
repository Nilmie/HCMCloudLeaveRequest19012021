package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class LeaveRequest {
	
	WebDriver driver;
	
	  public LeaveRequest(WebDriver driver)
	  {
		  this.driver = driver;
	  }

	public void SelectLeaveYear() 
    {
    	//Select Leave Year
		driver.findElement(By.xpath("(//div[contains(@class,'col-xs-4 hcm-form_controller')]//input)[1]")).click();
		driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='2021']")).click();
    	//driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
    }
	
	public void SelectLeaveType() 
	{
		//Select Leave Type 
    	driver.findElement(By.xpath("//div[contains(@class,'col-xs-6 hcm-form_controller')]//select//option[3]")).click();
    	driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
	}

	public void SelectLeaveReason() 
	{	
		//Select Leave Reason
		Select LeaveReason = new Select (driver.findElement(By.xpath("(//div[contains(@class,'col-xs-10-2 hcm-form_controller')]//select)[1]")));
		LeaveReason.selectByIndex(0);
	}
	
	public void SelectStartDate() 
	{
		//Select Start Date
		driver.findElement(By.xpath("(//div[contains(@class,'col-xs-4 hcm-form_controller')]//input)[2]")).click();
		driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//td[@data-day='01/20/2021']")).click();
	}
	
	public void SelectEndDate() 
	{	
		//Select End Date
		driver.findElement(By.xpath("(//div[contains(@class,'col-xs-4 hcm-form_controller')]//input)[3]")).click();
		driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//td[@data-day='01/20/2021']")).click();
	}
	
	public void EnterRemarks()
	{
		//Enter Remarks
		driver.findElement(By.xpath("//div[@class='hcm-reason_area']//textarea[1]")).sendKeys("Leave testing Automation");
	}
	
	public void ClickButtonApply()
	{
		//Click on Apply Button
		driver.findElement(By.xpath("(//div[contains(@class,'hcm-button_area top-20')]//button)[2]")).click();
	}
	
    public String Verify_NoOfDays()
    {
    	By DaysCount = By.className("days-count");
	    return   driver.findElement(DaysCount).getText();
    }
}
