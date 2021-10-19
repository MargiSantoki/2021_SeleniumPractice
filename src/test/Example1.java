package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		//driver.get("file:///E:/Java%20Selenium/Assignment%20&%20Test/Pattern%20Printing.pdf");
		//driver.get("http://www.webscantest.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.navigate().to("https://www.amazon.in/");
		//driver.navigate().to(new URL("https://www.google.com/"));
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}
}
