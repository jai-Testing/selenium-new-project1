package org.task.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
         
		driver.get("http://demo.automationtesting.in/Alerts.html");

		//======simple alert()=======
		WebElement clk1 = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		clk1.click();
		WebElement clk2 = driver.findElement(By.xpath("//button[contains(text(),'display ')]"));
		clk2.click();
		
		//Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		//a.accept();
		String t = a.getText();
		System.out.println(t);
		a.accept();
	}

}
