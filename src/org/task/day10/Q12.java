package org.task.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.findElement(By.id("heading303")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' DAY 10 TASK']")).click();
		
		
		String parId = driver.getWindowHandle();
		System.out.println("parent ID : " + parId);
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println("All windows Id : " + allWinId);

		for (String eachId : allWinId) {

			if (!parId.equals(allWinId)) {
				driver.switchTo().window(eachId);
			}
		}

		
		WebElement getTxt = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
		String txt = getTxt.getText();
		String substring = txt.substring(700);
		System.out.println(substring);
	}

}
