package org.mvn.tasks;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://adactinhotelapp.com/");

		driver.findElement(By.id("username")).sendKeys("jaikumarR");
		driver.findElement(By.id("password")).sendKeys("jaikumar");
		driver.findElement(By.id("login")).click();

		WebElement fstdrpdwn = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(fstdrpdwn);
		s.selectByVisibleText("Melbourne");
//		Thread.sleep(3000);
//		WebElement secdrpdwn = driver.findElement(By.xpath("//select[@id='hotels']"));
//		Select s1=new Select(secdrpdwn);
//		s.selectByVisibleText("Hotel Sunshine");
//		Thread.sleep(3000);
//		WebElement thirddrpdwn = driver.findElement(By.xpath("//select[@id='room_type']"));
//		Select s2=new Select(thirddrpdwn);
//		s.selectByVisibleText("Standard");
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		driver.findElement(By.id("radiobutton_1")).click();
		driver.findElement(By.name("continue")).click();

		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("jai");

		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("kumar");

		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("sdafafsfafa");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123456");

		Select ss = new Select(driver.findElement(By.xpath("//select[@id='cc_type']")));
		ss.selectByVisibleText("American Express");

		Select sl = new Select(driver.findElement(By.xpath("//select[@id='cc_exp_month']")));
		sl.selectByVisibleText("March");

		Select sn = new Select(driver.findElement(By.xpath("//select[@id='cc_exp_year']")));
		sn.selectByIndex(3);

		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("213");
		driver.findElement(By.id("book_now")).click();

		// driver.findElement(By.id("logout")).click();

		Thread.sleep(9000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement pgDown = driver.findElement(By.xpath("//a[text()='Adactin.com']"));
		js.executeScript("arguments[0].scrollIntoView(true)", pgDown);

		WebElement gettxt = driver.findElement(By.xpath("//input[@id='order_no']"));
		String text = gettxt.getAttribute("value");
		System.out.println(text);

		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("D:\\eclipse workspace\\SeleniumGT\\Screenshot\\orderId.png");
//		FileUtils.copyFile(src, des);

	}

}
