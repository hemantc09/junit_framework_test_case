/*
 * Programmer : Hemant Choudhari
 * This is the code examples show I am familiar with Selenium Juni. 
 * Learning by myself from Udemy.com to imporve my skills regarding automation using java and selenium
 * date: 09/18/2017
 */
package junit_framework_test_case;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateBetweenPages {
	WebDriver driver;
	String baseUrl;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","/Users/Hemantc09/Documents/SeleniumFiles/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Title of the page is:"+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is :" +currentUrl);
			
		String navigateUrl = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(navigateUrl);
		currentUrl = driver.getCurrentUrl();
		System.out.println("Navigate to the login page");
		System.out.println("Current Url:"+currentUrl);
		Thread.sleep(2000);
		
		driver.navigate().back(); // go back to the previous page
		System.out.println("Navigate Back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URl :"+currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigate Forward");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URl :"+currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().back(); // go back to the previous page
		System.out.println("Navigate Back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URl :"+currentUrl);
		
		driver.navigate().refresh();
		System.out.println("Navigate Refresh");
		driver.get(currentUrl);
		System.out.println("Navigate Refresh");
		
		String pageSource = driver.getPageSource();
		System.out.println("Page Source:"+pageSource);
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
