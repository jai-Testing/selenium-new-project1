package org.task.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
         
		driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	
        WebElement clk = driver.findElement(By.xpath("//button[contains(text(),'confirm ')]"));
        clk.click();
        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        
        a.accept();
        Thread.sleep(3000);
        WebElement clk1 = driver.findElement(By.id("demo"));
        clk1.getAttribute("value");
       // System.out.println(a.getText());
        
        
        
        
			}

}
