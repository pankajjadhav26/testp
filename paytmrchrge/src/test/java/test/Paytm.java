package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.Recharge;


public class Paytm {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	Recharge  recharge  = new Recharge (driver);
	recharge.mobileno();
	recharge.operator();
	
    recharge.bsnl();
	recharge.circle();
	recharge.andhrapradesh();
	recharge.amount();
	recharge.proceedbutton();

	}

	}




