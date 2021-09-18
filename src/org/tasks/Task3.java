package org.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
