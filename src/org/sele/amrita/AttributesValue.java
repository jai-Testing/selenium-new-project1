package org.sele.amrita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributesValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https:en-gb.facebook.com/");

		// ===max====

		driver.manage().window().maximize();

		WebElement txtEmail = driver.findElement(By.id("email"));

		txtEmail.sendKeys("jai");

		String t1 = txtEmail.getAttribute("name");
		System.out.println(t1);

		String t2 = txtEmail.getAttribute("value"); // user input auto stored in value attribute
		System.out.println(t2);

		String t3 = txtEmail.getAttribute("abc");
		System.out.println(t3);
		driver.close();

	}

}
