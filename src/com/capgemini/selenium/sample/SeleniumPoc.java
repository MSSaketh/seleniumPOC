/*
 * POC on the Selenium WebDriver by automating the google search
 */

package com.capgemini.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Selenium POC class
public class SeleniumPoc {

//	main method
	public static void main(String[] args) throws InterruptedException {
//		Setting the System property by key and value
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\smaringa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
//		lst-ib-- id   btnK-- name
		driver.findElement(By.id("lst-ib")).sendKeys("Capgemini");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).submit();
		String at = driver.getTitle();
		System.out.println(at);
		String et = "Capgemini - Google Search";
		if (at.equalsIgnoreCase(et)) {
			System.out.println("Test Success");
		} else {
			System.out.println("Test Failed");
		}

	}
}
