import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class SignInTest {
 

	
	 WebDriver driver = null;
		
    @BeforeTest
   public void setUpTest() {
			
	  String projectlocation = System.getProperty("user.dir");
	  System.setProperty("webdriver.gecko.driver",projectlocation+ "\\lib\\geckodriver\\geckodriver.exe");
	  driver = new FirefoxDriver();
		    
	  //go to website
	  driver.get("http://automationpractice.com/index.php");
		     	
    }
	
	
	
	@Test
  public void signIn() throws Exception {
		
    //click sign in button to login in webpage
    WebElement login=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]")); //*[@id="header"]/div[2]/div/div/nav/div[1]/a
    login.click();
    Thread.sleep(3000);
    
    JavascriptExecutor js = (JavascriptExecutor)driver;  
	js.executeScript("scrollBy(0, 200)");
	Thread.sleep(3000);	
		
	driver.findElement(By.id("email"));
    WebElement username=driver.findElement(By.id("email"));
	username.sendKeys("denisa.luca@fshnstudent.info");
    Thread.sleep(3000);
		
		
    driver.findElement(By.id("passwd"));
    WebElement pass=driver.findElement(By.id("passwd"));
	pass.sendKeys("denisa12");
    Thread.sleep(3000);	
		
		
    WebElement submit=driver.findElement(By.id("SubmitLogin"));
    submit.click();
    Thread.sleep(3000);
    	
    WebElement logout=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
    logout.click();
    Thread.sleep(3000);	
				
		
  }
 

  @AfterTest
  public void tearDownTest() {
		//close browser
		 driver.quit();
		 System.out.println("Sign In with credentials done .");
		      
	         }
  
  
}
