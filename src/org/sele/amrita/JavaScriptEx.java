package org.sele.amrita;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptEx {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\sub\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	//	Actions a = new Actions(driver);
	//	Robot r = new Robot();
		
		driver.manage().window().maximize();

		driver.get("https:en-gb.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','jaikumar')", txtEmail);
	
		WebElement txtPass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','1234567')", txtPass);
		
		WebElement login = driver.findElement(By.name("login"));
	    js.executeScript("arguments[0].click()", login);

	}

}
