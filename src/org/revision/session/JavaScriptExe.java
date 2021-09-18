package org.revision.session;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\sub\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:en-gb.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement txtuser = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','jaikumar')",txtuser);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','1234')",txtpass);
		
		WebElement btnlog = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btnlog);
	}

}
//WebElement txtEmail = driver.findElement(By.id("email"));
//js.executeScript("arguments[0].setAttribute('value','jaikumar')", txtEmail);
//
//WebElement txtPass = driver.findElement(By.id("pass"));
//js.executeScript("arguments[0].setAttribute('value','1234567')", txtPass);
//
//WebElement login = driver.findElement(By.name("login"));
//js.executeScript("arguments[0].click()", login);
