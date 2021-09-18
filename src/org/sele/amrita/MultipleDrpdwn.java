package org.sele.amrita;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDrpdwn {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement dd = driver.findElement(By.id("fruits"));
		
		Select s =new Select(dd);
		
		s.selectByIndex(2);
		s.selectByValue("apple");
		s.selectByVisibleText("Grape");
		
		if(s.isMultiple()) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		WebElement fsopt = s.getFirstSelectedOption();
		String text = fsopt.getAttribute("value");
		System.out.println(text);
		//===================================================
		List<WebElement> options = s.getAllSelectedOptions();
		
		for (WebElement getopt : options) {
			System.out.println(getopt.getText());
		}
	}

}
