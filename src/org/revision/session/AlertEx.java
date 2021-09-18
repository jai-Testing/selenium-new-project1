package org.revision.session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\sub\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		
		WebElement clk = driver.findElement(By.xpath("//button[contains(text(),'confirm ')]"));
		clk.click();
		Alert a= driver.switchTo().alert();
		
		String text = a.getText();
		System.out.println(text);
		
		a.accept();
		String text3 = driver.findElement(By.id("demo")).getText();
		System.out.println(text3);
	}

}
