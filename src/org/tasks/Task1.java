package org.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
		
   		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.greenstechnologys.com/");
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is : "+url);
		String tit = driver.getTitle();
		System.out.println(tit);
		driver.close();
		
		//driver.get("http://gmail.com/");
		//driver.get("http://www.flipkart.com/");
		//driver.get("http://greenstech.in/selenium-course-content.html");
	}

}
