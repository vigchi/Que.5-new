package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh Chinnappa\\eclipse-workspace\\Day2Task\\Drivers\\chromedriver.exe");
		//Launching Browser 
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		user.sendKeys("vigneshchinna@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("123456");
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", button);

	}

}
