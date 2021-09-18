package org.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://gmail.com/");
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is : "+url);
		String tit = driver.getTitle();
		System.out.println(tit);
		driver.close();
		
		
		
		
	}

}
