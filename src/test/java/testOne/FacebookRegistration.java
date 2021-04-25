package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookRegistration 
{
	@Test
	public void setup() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Selenium\\chromedriver2021\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	System.out.println("Page title is " + driver.getTitle());
	
	driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
	Thread.sleep(4000);
	
	driver.findElement(By.name("firstname")).sendKeys("Mark");
	driver.findElement(By.name("lastname")).sendKeys("Stoinis");
	driver.findElement(By.name("reg_email__")).sendKeys("7586534363");
	driver.findElement(By.name("reg_passwd__")).sendKeys("abc$1234");
	
	Select day = new Select(driver.findElement(By.name("birthday_day")));
	day.selectByIndex(5);
	
	Select month = new Select(driver.findElement(By.name("birthday_month")));
	month.selectByValue("1");
	
	Select year = new Select(driver.findElement(By.name("birthday_year")));
	year.selectByVisibleText("1990");
	
	}
}
