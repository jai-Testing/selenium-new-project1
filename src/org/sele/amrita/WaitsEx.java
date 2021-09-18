package org.sele.amrita;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.get("https:en-gb.facebook.com/");
		
		//====Thread.sleep(3000);====STATIC WAIT=======
		
//===================dynamic wait==== IMPLICIT WAIT======
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//=================EXPLICIT WAIT========WEBDRIVER WAIT===================
		
		WebDriverWait w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("jaikumar");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234");
		
		w.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		w.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}
