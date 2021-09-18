package org.task.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6FrmYoutube {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("newTabsBtn")).click();
		
		String parId = driver.getWindowHandle();
		System.out.println("Parent Id : "+parId);
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		int count =0;
		for (String allIds : allId) {
			
			if(count==2) {
				driver.switchTo().window(allIds);
			}
			count++;
		}
		
    	driver.findElement(By.id("alertBox")).click();
		driver.close();
		
		driver.switchTo().window(parId);
		driver.quit();
		
	}

}
