package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUKANYA\\eclipse-workspace\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\SUKANYA\\Desktop\\1.html");
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int size = link.size();
System.out.println(size);
for(int i=0;i<link.size();i++)
{
	String text = link.get(i).getText();
	System.out.println(text);
}
	}

}
