/*
 * Programmer : Hemant Choudhari
 * This is the code examples show I am familiar with Selenium Juni. 
 * Learning by myself from Udemy.com to imporve my skills regarding automation using java and selenium
 * date: 09/11/2017
 */
package junit_framework_test_case;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActionsOnWeb {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/Hemantc09/Documents/SeleniumFiles/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	@Test
	public void test() {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys("hemantc09@gmail.com");
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("abc123a");
		driver.findElement(By.name("commit")).click();	
	}

	

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	
}
