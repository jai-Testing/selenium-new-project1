package org.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		
		
		//driver.get("http://greenstech.in/selenium-course-content.html");
		//driver.get("http://www.facebook.com");
		//driver.get("http://www.amazon.in");
		
		
		
	}

}
