import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpTest {
	
	
	
	
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
	public  void signUp() throws Exception {
		
    
	//click sign in button to create an address
    //driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).sendKeys(Keys.RETURN);
		
    WebElement signup=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));	
	signup.click();	
    Thread.sleep(2000);	
	
    JavascriptExecutor js = (JavascriptExecutor)driver;  
	js.executeScript("scrollBy(0, 100)");
	Thread.sleep(2000);	
	
	driver.findElement(By.name("email_create"));
    WebElement emailadd=driver.findElement(By.name("email_create"));
	emailadd.sendKeys("denisa.luca@fshnstudent.info");
    Thread.sleep(3000);
    
    WebElement create=driver.findElement(By.id("SubmitCreate"));	
	create.click();	
    Thread.sleep(2000);	
    js.executeScript("scrollBy(0, 100)");
    Thread.sleep(2000);
    
    
    
    //complete form validation,radio button ,check ,search filters
    WebElement tittle=driver.findElement(By.xpath("//*[@id=\"uniform-id_gender2\"]"));	
    tittle.click();
	Thread.sleep(2000);
       
    driver.findElement(By.id("customer_firstname"));
    WebElement firstname=driver.findElement(By.id("customer_firstname"));
    
    driver.findElement(By.id("customer_lastname"));
    WebElement lastname=driver.findElement(By.id("customer_lastname"));
   
    firstname.sendKeys("Denisa");
    Thread.sleep(2000);
    lastname.sendKeys("Luca");
    Thread.sleep(2000);
    
    driver.findElement(By.id("passwd"));
    WebElement password=driver.findElement(By.id("passwd"));
    password.sendKeys("denisa12");
    Thread.sleep(2000);
    
    js.executeScript("scrollBy(0, 160)");
    Thread.sleep(3000);
    
    
   // Locating and Clicking a CheckBox By using ID
    driver.findElement(By.id("optin")).click();
    Thread.sleep(2000);
    
     
    js.executeScript("scrollBy(0, 300)");
    Thread.sleep(3000);
   
    driver.findElement(By.id("company"));
    WebElement company=driver.findElement(By.id("company"));
    company.sendKeys("Innova");
    Thread.sleep(2000);
    
     
    driver.findElement(By.id("address1"));
    WebElement address=driver.findElement(By.id("address1"));
    address.sendKeys("Wall Street");
    Thread.sleep(2000);
  
    driver.findElement(By.id("address1"));
    WebElement address2=driver.findElement(By.id("address2"));
    address2.sendKeys("347");
    Thread.sleep(2000);
    
    js.executeScript("scrollBy(0, 250)");
    Thread.sleep(3000);
    
    
    driver.findElement(By.id("city"));
    WebElement city=driver.findElement(By.id("city"));
    city.sendKeys("New York");
    Thread.sleep(2000);
    
    
    //selecting a combo box
    driver.findElement(By.id("uniform-id_state")).click();//click on that combo 
    driver.findElement(By.id("id_state"));
    WebElement state=driver.findElement(By.id("id_state"));
    state.sendKeys("New York");
    Thread.sleep(2000);
    
    js.executeScript("scrollBy(0, 200)");
    Thread.sleep(2000);
    
    driver.findElement(By.id("postcode"));
    WebElement zipcode=driver.findElement(By.id("postcode"));
    zipcode.sendKeys("0695385203");
    Thread.sleep(2000);
    
    
    js.executeScript("scrollBy(0, 300)");
    Thread.sleep(3000);
    
    driver.findElement(By.id("uniform-id_country")).click();//click on that combo
    driver.findElement(By.id("id_country"));
    Thread.sleep(2000);
    
      
    driver.findElement(By.id("phone_mobile"));
    WebElement mobile=driver.findElement(By.id("phone_mobile"));
    mobile.sendKeys("0695385203");
    Thread.sleep(2000);
    
   
    WebElement register=driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
    register.click();
	Thread.sleep(2000);

	js.executeScript("scrollBy(0, 150)");
    Thread.sleep(3000);
			
	
	}

	
	@AfterTest
	public void tearDownTest() {
	//close browser
	     driver.quit();
	      System.out.println("Sign Up done successfully");
	      
	}

}


