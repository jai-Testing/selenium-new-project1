package org.task.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");

		driver.findElement(By.id("username")).sendKeys("jaikumar");
		driver.findElement(By.id("password")).sendKeys("kumar92");
		driver.findElement(By.id("login")).click();
		
		WebElement ddRoomType = driver.findElement(By.xpath("//select[@id='location']"));
		Select s=new Select(ddRoomType);
		
		List<WebElement> options = s.getOptions();
		
		for (int i=0; i<options.size();i++) {
			WebElement ele = options.get(i);
			System.out.println(ele.getText());
		}
		
	}

}
