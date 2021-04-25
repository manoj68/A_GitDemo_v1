package testOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropDown 
{
	@Test
	public void setup() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Selenium\\chromedriver2021\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
	System.out.println("Page title is " + driver.getTitle());

	//click on dropdown 
	driver.findElement(By.id("menu1")).click();
	
	//to get the list of element we need to find the list of same options an dthis  xpath will also show us all the available options
	List<WebElement> dropdown = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));

	//	dropdown value will be stored in element one by one in enhanced for loop
	for(WebElement element: dropdown)
	{
		String innerhtml = element.getAttribute("innerHTML");
		if(innerhtml.contentEquals("JavaScript"))
		{
			element.click();
			break;
		}
		System.out.println("values from dropdown " +innerhtml);

	}
	
	}


}
