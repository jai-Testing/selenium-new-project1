package org.task.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		Robot r = new Robot();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/webhp");

		WebElement txtLine = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		txtLine.sendKeys("vel Murugan");

		a.contextClick(txtLine).perform();
		// a.doubleClick(txtLine).perform();

		for (int i = 0; i < 4; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}

		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		/*
		 * r.keyPress(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_A);
		 * r.keyRelease(KeyEvent.VK_CONTROL); r.keyRelease(KeyEvent.VK_A);
		 * Thread.sleep(2000);
		 */

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);

		Thread.sleep(2000);

	}

}
