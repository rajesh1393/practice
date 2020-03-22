package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	protected static WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Git_code\\practice\\Parallel_testing\\Updated_Jar\\Driver\\chromedriver.exe");
		 
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage.window.maximize(); 
  }
}
