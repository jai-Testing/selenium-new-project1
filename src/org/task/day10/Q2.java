package org.task.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.name("keyword")).sendKeys("iphone 7");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[@class='product-title'])[5]")).click();
		Thread.sleep(3000);
		String parId = driver.getWindowHandle();
		System.out.println("parent ID : " + parId);
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println("All windows Id : " + allWinId);

		for (String eachId : allWinId) {

			if (!parId.equals(allWinId)) {
				driver.switchTo().window(eachId);
			}
		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		WebElement pricetag = driver.findElement(By.xpath("//span[@class='price']"));
		String text = pricetag.getText();
		System.out.println(text);
		
	}

}
