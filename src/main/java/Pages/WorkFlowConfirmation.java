package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkFlowConfirmation {
	
	 WebDriver driver;
 	By WorkFlow = By.xpath("(//div[@class='textfield']//select)[1]");
 	By WorkFlowApprover = By.xpath("(//div[@class='textfield']//select)[2]");
 	By ButtonApply = By.xpath("//div[@class='row row-align-middle']//button[1]");
	 
	public WorkFlowConfirmation(WebDriver driver)
	{

	        this.driver = driver;

	}
	    
	public void SelectWorkFlow() 
	{
		//driver.findElement(By.id("WorkflowId")).click();
		Select Workflow = new Select(driver.findElement(By.id("WorkflowId")));
		Workflow.selectByValue("23");
       	driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
	}
	
	public void SelectWorkFlowApprover() 
	{
    	driver.findElement(By.xpath("(//div[@class='bottom']//div)[1]//select//option[2]")).click();
    	driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
	}
	
	public void ClickButtonApply() 
	{
    	driver.findElement(ButtonApply).click();
   
	}
	
}
