package org.sele.amrita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelectEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();

		driver.get("https:en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		WebElement dropMnth = driver.findElement(By.id("month"));
		Select s =new Select(dropMnth);
		
		if (s.isMultiple()) {
			
			System.out.println("multiple");
		
		} else {
          
			System.out.println("single");
		}
		
		s.selectByValue("2");
		s.selectByIndex(11);
		s.selectByVisibleText("Apr");
		
		s.deselectAll(); 
		//=====oly multiple select oly accepts      
	}

}       //    "http://output.
