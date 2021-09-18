package org.task.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q5 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();

		driver.get("https:en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		
		Select s = new Select (day);
		List<WebElement> dayopts = s.getOptions();
		
		for(int i=0;i<dayopts.size();i=i+2) {
			WebElement opts = dayopts.get(i);
			System.out.println(opts.getText());
		}
	}

}
