package org.task.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
	
		WebElement gtTxt = driver.findElement(By.xpath("(//div[@class='trainer-info'])[2]"));
		String text = gtTxt.getText();
		System.out.println(text);
	}

}
