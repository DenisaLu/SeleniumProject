import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class FileUpload {
	
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
   public void checkrows()  throws Exception {
		
	 //sign in 
     WebElement login=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
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
	    	
	    WebElement contact=driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
	     contact.click();
	     Thread.sleep(3000);
	   
	    
	    js.executeScript("scrollBy(0, 200)");
		Thread.sleep(3000);
		
		 // FILE UPLOADING USING SENDKEYS .... 
	    WebElement choosefile = driver.findElement(By.name("fileUpload"));
		  //click on ‘Choose file’ to upload the desired file
	      choosefile.sendKeys("C:\\Users\\USER\\Desktop\\File upload\\dd.txt"); //Uploading the file using sendKeys
	      Thread.sleep(2000);
	      
   } 
  

	@AfterTest
	  public void tearDownTest() {
	 // close browser
	  driver.quit();
	  System.out.println("File is Uploaded Successfully");
			      
		         }

}
