package org.task.day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("http://toolsqa.com/");
	}
 
}
