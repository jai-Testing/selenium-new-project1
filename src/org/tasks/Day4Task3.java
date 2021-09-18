package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Task3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
			
				driver.manage().window().maximize();
				
				driver.get("http://www.greenstechnologys.com/");
				
				WebElement para = driver.findElement(By.xpath("(//p[@style=\"text-align:justify; font-size:18px;\"])[2]"));
				
String para2 = para.getText();
System.out.println(para2);
		
	}

}
