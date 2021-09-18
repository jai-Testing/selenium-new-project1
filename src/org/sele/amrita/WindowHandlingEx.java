package org.sele.amrita;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");

		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"))
				.sendKeys("sterlomax sanitizer");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Sterlomax 75% Isopropyl Based Sanitizers 5000 mL Pack of 1']"))
				.click();

		String parId = driver.getWindowHandle();
		System.out.println("parent ID : " +parId);
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println("All windows Id : " +allWinId);
		
		for (String eachId : allWinId) {
			
		
		if(!parId.equals(allWinId)) {
			driver.switchTo().window(eachId);
		}
		}
		
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();

		
		
		
		
		
		
		
		
	}

}
