package org.task.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement scrollDown = driver.findElement(By.xpath("//span[text()='Recent Articles']"));
		String text = scrollDown.getText();
		System.out.println(text);
		//js.executeScript("arguments[0].ScrollIntoView(true)", scrollDown);
		
		js.executeScript("arguments[0].scrollIntoView(true)",scrollDown);

		
		
	}

}
