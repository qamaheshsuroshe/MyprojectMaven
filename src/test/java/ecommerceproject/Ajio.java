package ecommerceproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  
	  public void ajioTest() throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
		  Reporter.log("opening ajio",true);
		  driver.get("https://www.ajio.com/");
		  Thread.sleep(5000);
		  driver.close();
		  
		  
  }
}
