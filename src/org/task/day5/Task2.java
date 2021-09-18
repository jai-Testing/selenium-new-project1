package org.task.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\sub\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.manage().window().maximize();

		driver.get("http://www.amazon.in");
		WebElement primetxt = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		
		a.moveToElement(primetxt).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-prime\"]/div[2]/div[1]/a")).click();
		
		System.out.println("ACTIONS PERFORMED");
		
	}

}
