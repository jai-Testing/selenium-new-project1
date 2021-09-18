package org.sele.amrita;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\sub\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
	
		WebElement table = driver.findElement(By.id("customers"));
	
		// to iterate all data using enhanched for loop
		
	  List <WebElement> allRows = table.findElements(By.tagName("tr"));
	  
	  for (WebElement row : allRows) {
		
		List<WebElement> allData = row.findElements(By.tagName("td"));
		
		for (WebElement data : allData) {
			
		// System.out.println(data.getText());
		
		//to fetch particular data in table 	
			String text = data.getText();
		if(text.equals("Canada")) {
			System.out.println("data name : "+text);
			//System.out.println(i);
			//System.out.println(i);
		}
		}
		
	}
	  // to print all the cells without loop
	  
	 System.out.println(table.getText());
	 
	 //
	  
	  
	}
}
	
	
	
	


