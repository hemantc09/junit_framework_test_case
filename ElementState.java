/*
 * Programmer : Hemant Choudhari
 * This is the code examples show I am familiar with Selenium Juni. 
 * Learning by myself from Udemy.com to imporve my skills regarding automation using java and selenium
 * date: 09/14/2017
 */
package junit_framework_test_case;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementState {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"/Users/Hemantc09/Documents/SeleniumFiles/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com/?gws_rd=ssl";
		driver.navigate().to(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		WebElement e1 = driver.findElement(By.id("gs_htif0"));
		System.out.println("e1 is enabled?:" + e1.isEnabled());

		WebElement e2 = driver.findElement(By.id("gs_taif0"));
		System.out.println("e2 is enabled?:" + e2.isEnabled());

		WebElement e3 = driver.findElement(By.id("lst-ib"));
		System.out.println("e3 is enabled?:" + e3.isEnabled());
		e3.sendKeys("Hemant Art's");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
