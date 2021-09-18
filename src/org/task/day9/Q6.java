package org.task.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q6 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement cntry = driver.findElement(By.name("country"));
		
		Select s=new Select(cntry);
		List<WebElement> alloptions = s.getOptions();
		
		for (WebElement alops : alloptions) {
			System.out.println(alops.getText());
		}
	}

}
