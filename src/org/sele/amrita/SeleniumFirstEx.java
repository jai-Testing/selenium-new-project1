package org.sele.amrita;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
		"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		System.out.println("browser opened");
		
		System.out.println("CURRENT URL IS : "+driver.getCurrentUrl());
		
	String title=	driver.getTitle();
	System.out.println(title);
		driver.close();
		
			}

}
