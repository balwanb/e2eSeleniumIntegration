package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TC001Test {
	
	@Test
  public void fbLogin()
  {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("balwan@clarion");
		driver.findElementById("pass").sendKeys("clarion@123");
		//driver.findElementById("loginbutton").click();
//driver.findElement(By.xpath("//button[@id=\"loginbutton\"]")).click();
		System.out.println("facebook login1");
		driver.quit();
  }
	
	
	
	

}
