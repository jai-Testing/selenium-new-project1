package org.task.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4a {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		Thread.sleep(4000);
		
		
        WebElement ifr = driver.findElement(By.xpath("//frame[@name='login_page']"));
		
		driver.switchTo().frame(ifr);
		
		
		
		WebElement txtInput = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		txtInput.sendKeys("jai");
		WebElement clk = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		clk.click();
		
	}

}
