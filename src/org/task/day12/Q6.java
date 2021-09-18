package org.task.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement txtuser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].setAttribute ('value','jaikumar@gmail.com')", txtuser);
		Object o = js.executeScript("return arguments[0].getAttribute('value')", txtuser);

		Thread.sleep(3000);
		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute ('value','jaikumar')", txtpass);
		Object o1 = js.executeScript("return arguments[0].getAttribute('value')", txtpass);
    
        
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		js.executeScript("arguments[0].click()", button);
	    
		System.out.println(o);
		System.out.println(o1);
			}

}
