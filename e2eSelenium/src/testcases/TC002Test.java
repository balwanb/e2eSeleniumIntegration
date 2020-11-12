package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC002Test {
	
	@Test
	  public void mmtLogin()
	  {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("balwan@clarion");
		driver.findElementById("pass").sendKeys("clarion@123");
		
			System.out.println("mmt login2");
			driver.quit();
	  }
		

}
