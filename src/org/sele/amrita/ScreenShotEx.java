package org.sele.amrita;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotEx {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//Actions a = new Actions(driver);

		driver.manage().window().maximize();

		driver.get("https:en-gb.facebook.com/");
		// ========= Downcasting==============
		TakesScreenshot tk = (TakesScreenshot) driver;

		// =======use getScreenshot method=========
		File src = tk.getScreenshotAs(OutputType.FILE);
		// ========create new file location=====
		// =====create new folder in same project==== // fblogin.png by manual
		File des = new File("D:\\eclipse workspace\\SeleniumGT\\Screenshot\\fblogin.png");

		//====copy file from src to dec=====
		FileUtils.copyFile(src, des);
		
	}
	

}
