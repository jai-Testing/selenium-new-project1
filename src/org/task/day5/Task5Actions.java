package org.task.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\sub\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Actions a = new Actions(driver);

		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html ");

		WebElement bnkbx = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement emtbx = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bnkbx, emtbx).perform();

		WebElement amt5k = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement bx2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(amt5k, bx2).perform();

		WebElement slebx = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']"));
		WebElement bx3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(slebx, bx3).perform();

		WebElement bx5k = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[2]"));
		WebElement bx4 = driver.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(bx5k, bx4).perform();
		
		System.out.println("ACTIONS PERFORMED");
	}

}
