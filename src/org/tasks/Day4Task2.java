package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
				driver.get("http://greenstech.in/selenium-course-content.html");

				WebElement para = driver.findElement(By.xpath("(//div[@class=\"col-md-3 short-desc-with-logo widget widget_text\"])[2]"));

				String text = para.getText();
				
			System.out.println(text);
	
			driver.close();
	}

}
