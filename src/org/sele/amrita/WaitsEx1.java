package org.sele.amrita;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitsEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https:en-gb.facebook.com/");

//===============FLUENT WAIT=========================

		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(2, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS).ignoring(Exception.class);
		f.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("jaikumar");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234");

		f.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		WebElement login = driver.findElement(By.name("login"));
		login.click();

		f.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}
