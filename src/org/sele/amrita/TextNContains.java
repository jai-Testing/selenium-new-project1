package org.sele.amrita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextNContains {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
		
				driver.manage().window().maximize();
				
		WebElement clk = driver.findElement(By.xpath("//a[text()='கடவுச்சொல்லை மறந்துவிட்டீர்களா?']"));
		clk.click();
		
		String s = clk.getText();
		System.out.println(s);
	}

}
