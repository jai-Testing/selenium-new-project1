package org.task.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demoqa.com/automation-practice-form/");
		driver.findElement(By.id("firstName")).sendKeys("jai");
		
		
//		WebElement stateNcity = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
//		stateNcity.click();
//		Select s = new Select(stateNcity);
//		List<WebElement> options = s.getOptions();
//		System.out.println(options.size());
//		for (WebElement stateOpt : options) {
//			System.out.println(stateOpt.getText());
//		}
		
		
	}

}
