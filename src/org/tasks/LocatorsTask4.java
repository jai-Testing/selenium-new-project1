package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser opened");
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
		System.out.println("Facebook opened");
		
		WebElement userId = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		userId.sendKeys("jaikumar");
		
		WebElement pass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		pass.sendKeys("665788878");
		
		WebElement clickbtn = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		clickbtn.click();
		
		driver.close();
		
		
	}

}
