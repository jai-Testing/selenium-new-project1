package org.sele.amrita;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeCasting {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // webdriver is interface

		driver.manage().window().maximize();

		// ---------exaample--------

		List l = new ArrayList<>(); // convertin child to parent=upcasting

		// ========downcasting===========

		int a = 4;
		long b = a; // but

		long s = 8;
		int bb = (int) s;
		// new datatype newvar=(newdatatype)=old var;

		driver.get("http://greenstech.in/selenium-course-content.html");

		// ===webdriver ----> javaScriptExecutor===>downcasting

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement pgDown = driver.findElement(By.xpath("//button[@class='showmore']"));
		js.executeScript("arguments[0].scrollIntoView(true)", pgDown);

		Thread.sleep(3000);
		
		WebElement pgUp = driver.findElement(By.xpath("(//a[text()='Contact Us'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(false)", pgUp);

	}

}
