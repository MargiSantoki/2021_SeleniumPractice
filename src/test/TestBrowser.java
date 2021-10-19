package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBrowser {

	void facebookSignup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.out.println("STEP - Open Chrome Browser");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("STEP - Enter facebook url");
		driver.get("https://www.facebook.com");
		
		System.out.println("STEP - click on create account button");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(3000);
		System.out.println("STEP - Enter firstname");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("margi");
		
		System.out.println("STEP - Enter lastname");
		driver.findElement(By.name("lastname")).sendKeys("santoki");
		
		System.out.println("STEP - Enter email");
		driver.findElement(By.name("reg_email__")).sendKeys("margi.santoki@gmail.com");
		
		System.out.println("STEP - REenter email id");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("margi.santoki@gmail.com");
		
		System.out.println("STEP - Enter password");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pwd123@123");
		
		System.out.println("STEP - Enter Date of birth");
		WebElement birthDayElement = driver.findElement(By.xpath("//select[@title='Day']"));
		Select birthDaySelect = new Select(birthDayElement);
		birthDaySelect.selectByVisibleText("23");
		
		System.out.println("STEP - Enter Month of birth");
		WebElement birthMonthElement = driver.findElement(By.xpath("//select[@title='Month']"));
		Select birthDayMonth = new Select(birthMonthElement);
		birthDayMonth.selectByVisibleText("Feb");
		
		System.out.println("STEP - Enter Year of birth");
		WebElement birthYearElement = driver.findElement(By.xpath("//select[@title='Year']"));
		Select birthDayYear = new Select(birthYearElement);
		birthDayYear.selectByVisibleText("1997");
		
		System.out.println("STEP - Select Gender");
		driver.findElement(By.xpath("//input[@value = '1']"));
		
		driver.close();
		System.out.println("Test passed successfully");
	}
	
	public static void main(String[] args) throws InterruptedException {
		new TestBrowser().facebookSignup();
	}
}
