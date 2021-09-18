package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Tasks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
			
				driver.get("http://www.greenstechnologys.com");
				WebElement para = driver.findElement(By.xpath("//u[contains(text(),'Software')]"));

				String text = para.getText();
				
				System.out.println(text);
	}

}
