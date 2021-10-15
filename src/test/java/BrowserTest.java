import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserTest {
	
	WebDriver driver = null;
	
	@BeforeTest
	public  void setUpTest() {
		
		String projectlocation = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",projectlocation+ "\\lib\\geckodriver\\geckodriver.exe");
	    driver = new FirefoxDriver();
	   }
	      
	
	@Test
	public void websiteSearch() {
	      //go to website
	      driver.get("http://automationpractice.com/index.php");

	}     
	
	
	@AfterTest
	public void tearDownTest() {
	//close browser
	      driver.quit();
	      System.out.println("Test completed successefully");
	      
	}

}
