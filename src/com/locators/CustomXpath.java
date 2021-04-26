package com.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKANYA\\eclipse-workspace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
	//	driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("java");
		
		driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("java");
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();

	}

}
