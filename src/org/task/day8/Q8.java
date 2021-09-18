package org.task.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
		//====error=========
		driver.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("jai");
		
		driver.switchTo().frame("Revamp_Banner_ID");
		
		//input[@name='AuthenticationFG.USER_PRINCIPAL']
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("jai");
		
	}

}
