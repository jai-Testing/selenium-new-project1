package org.task.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
	
		List<WebElement> rows = table.findElements(By.tagName("tr"));
	System.out.println(rows.size());
		
		for(int i=0;i<rows.size();i++) {
			
				//WebElement row = rows.get(i);
				System.out.println(i);
				
				//List<WebElement> alldata = row.findElements(By.tagName("td"));
			//for(int j=0;j<alldata.size();i++) {
				//WebElement data = alldata.get(j);
				
				
			}
			
		}
	}

