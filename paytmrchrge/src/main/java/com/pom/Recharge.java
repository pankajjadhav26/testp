package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recharge {
	@FindBy (xpath = "//input[@type='tel']")
	private WebElement mobileno;
	
	@FindBy (xpath = "(//input[@type='text'])[1]" )
	private WebElement  operator;
	
	
	
	@FindBy (xpath = "//img[@alt='BSNL']")
	private WebElement bsnl;
	@FindBy (xpath = "(//input[@type='text'])[2]" )
	private WebElement circle;
	@FindBy (xpath = "//span[text()='Andhra Pradesh']")
	private WebElement andhrapradesh;
	
	@FindBy (xpath = "(//input[@type='text'])[3]")
	private WebElement amount;
	
	@FindBy (xpath = "//button[@class='_11kC  _15qf _2qE6']")
	private WebElement proceedbutton;
    public Recharge (WebDriver driver1)
	{
		PageFactory.initElements( driver1,this);
		
	}
    public void mobileno()
   {
    	mobileno.sendKeys("8830921066");
    	
   }
    public void operator() 
    {
    	operator.click();
    //	Select s = new Select(operator);
    	//s.selectByValue("3");
    }
    public void bsnl()
    {
    	bsnl.click();
    }
    public void circle()
    {
    	circle.click();
    }
    public void andhrapradesh()
    {
    	andhrapradesh.click();
    }
    public void  amount()
    {
    	amount.sendKeys("149");
    }
    public void proceedbutton()
    {
    	proceedbutton.click();
    	
    }


}


