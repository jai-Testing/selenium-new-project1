package org.task.day8;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q7 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions a = new Actions(driver);
		Robot r = new Robot();
		driver.get(
				"https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		
		WebElement ifr = driver.findElement(By.xpath("//frame[@name='login_page']"));
		
		driver.switchTo().frame(ifr);
		
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("jai");
		WebElement clk = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		clk.click();
		
		
		
		// Error Not able to right Click
		//can't enter password or we can't able findlocator in this page
		Alert aa = driver.switchTo().alert();
		System.out.println(aa);
	}

}
