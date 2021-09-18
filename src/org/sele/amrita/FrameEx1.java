package org.sele.amrita;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
	
	 //to find no of frames in webpage
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
	int frameCount = allFrames.size();
	System.out.println(frameCount);
	
	}

}
