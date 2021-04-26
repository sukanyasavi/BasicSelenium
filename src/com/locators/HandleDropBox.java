package com.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HandleDropBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKANYA\\eclipse-workspace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        
		driver.get("https://www.facebook.com/#");
        driver.findElement(By.partialLinkText("Create New")).click();
        Thread.sleep(50000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Select select = new Select(driver.findElement(By.name("birthday_month")));
        select.selectByVisibleText("Mar");
        
        driver.quit();
        
	}

}
