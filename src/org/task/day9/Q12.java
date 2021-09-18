package org.task.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q12 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement dd = driver.findElement(By.id("fruits"));
		
		Select s =new Select(dd);
		
		s.selectByIndex(2);
		s.selectByIndex(0);
		
		List<WebElement> allopts = s.getOptions();
		List<WebElement> alSelOpt = s.getAllSelectedOptions();
		System.out.println("\nSelected Options : ");
		for (WebElement selopts : alSelOpt) {
			System.out.println(selopts.getText());
		}
		
		allopts.removeAll(alSelOpt);
		System.out.println("\nUNSelected Options : ");
		
		for (WebElement bal : allopts) {
			System.out.println(bal.getText());
		}
		
	}

}
