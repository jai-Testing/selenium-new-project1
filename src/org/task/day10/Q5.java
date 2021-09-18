package org.task.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		String parId = driver.getWindowHandle();
		System.out.println("Parent Id : "+parId);
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		for (String allIds : allId) {
			
			if(!parId.equals(allId)) {
				driver.switchTo().window(allIds);
			}
		}
		
		driver.findElement(By.id("firstName")).sendKeys("jai");
		driver.close();
		
		driver.switchTo().window(parId);
		driver.quit();
	}

}
