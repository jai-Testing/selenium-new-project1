package org.sele.amrita;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MltDrpDwnEx1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
//		WebElement dd = driver.findElement(By.id("fruits"));
//		
//		Select s =new Select(dd);
//		List<WebElement> allOptions = s.getOptions();
//		
//		// to print all elements in list 
//		System.out.println("\nTo fetch all options in DropDown List");
//		for (WebElement lstOptns : allOptions) {
//			System.out.println(lstOptns.getText());
//		}
//		s.selectByIndex(1);
//		Thread.sleep(3000);
//		s.deselectAll();
	
	}

}
