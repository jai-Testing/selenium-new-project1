package org.sele.amrita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsNAttributes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
			
				driver.get("https:en-gb.facebook.com/");
				
				//===max====
				
				driver.manage().window().maximize();
				
				WebElement para = driver.findElement(By.xpath("//h2[contains(text(),'connect ')]"));
		String txt = para.getText();
		System.out.println(txt);
	}

}
