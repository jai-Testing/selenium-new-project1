package org.task.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement mo = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		
		a.moveToElement(mo).perform();
		Thread.sleep(8000);
		WebElement mo1 = driver.findElement(By.xpath("//*[@id=\"category7Data\"]/div[1]/div/div/p[10]/a/span"));
		a.moveToElement(mo1).perform();
		mo1.click();
		Thread.sleep(4000);
		WebElement clk = driver.findElement(By.xpath("(//div[@class='child-cat-name '])[1]"));
		clk.click();
	}

}
