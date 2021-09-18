package org.task.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		
		driver.get("http://www.greenstechnologys.com/");
        TakesScreenshot ts=(TakesScreenshot)driver;
        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        
        File des=new File("D:\\GreensFldr1\\jai\\subfldr\\fblogin.png");
        FileUtils.copyFile(screenshotAs, des);
        
	}

}
