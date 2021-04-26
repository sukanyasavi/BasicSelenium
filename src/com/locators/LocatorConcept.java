package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKANYA\\eclipse-workspace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		//1.Xpath
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("abc");;
		
		//2.id
		driver.findElement(By.id("lastname")).sendKeys("xyz");
		
		//3.name
		driver.findElement(By.name("Email")).sendKeys("abc@gmail.com");
		
		//4.css selector
		driver.findElement(By.cssSelector("#password")).sendKeys("1234");
		
		//5.link text
		driver.findElement(By.linkText("User Agreement")).click();
		
		driver.quit();
		
		
	}

}
