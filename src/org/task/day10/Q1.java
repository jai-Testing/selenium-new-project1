package org.task.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Robot r = new Robot();
		Actions a = new Actions(driver);
		WebElement rtClk = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));

		a.contextClick(rtClk).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String parId = driver.getWindowHandle();
		System.out.println("parent ID : " + parId);
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println("All windows Id : " + allWinId);

		for (String eachId : allWinId) {

			if (!parId.equals(allWinId)) {
				driver.switchTo().window(eachId);
			}
		}

		WebElement price = driver.findElement(By.id("priceblock_ourprice"));
		String text = price.getText();
		System.out.println(text);
	}

}
