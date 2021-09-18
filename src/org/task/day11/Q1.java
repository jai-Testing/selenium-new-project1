package org.task.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\sub\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
	
		String datas = table.getText();
		System.out.println(datas);
		
	}

}
