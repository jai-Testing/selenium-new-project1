package org.sele.amrita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://greenstech.in/selenium-course-content.html");

		// ========Actions class==========

		Actions a = new Actions(driver);

		WebElement coursesbox = driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(coursesbox).perform();
		Thread.sleep(2000);
		WebElement subcour = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		a.moveToElement(subcour).perform();
		
		WebElement sub1 = driver.findElement(By.xpath("//span[text()='PLSQL Certification']"));
        a.moveToElement(sub1).perform();
		sub1.click();
		
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));

		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

		a.dragAndDrop(src, des).perform();
	}

}
