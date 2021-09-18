package org.revision.session;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrShotEx {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\sub\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//Actions a = new Actions(driver);

		driver.manage().window().maximize();

		driver.get("https:en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\eclipse workspace\\SeleniumGT\\Screenshot\\fblog.png");
		
		FileUtils.copyFile(src, des);
		
	}

}
