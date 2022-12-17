package FirstPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class ValidLogin {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//Setting the environment for the test
		System.setProperty("Webdriver.edge.driver", ".\\msedgedriver.exe");
		
		//Launch the browser
	    driver=new EdgeDriver();
	    
//	    driver=new ChromeDriver();
//	    driver=new FirefoxDriver();
//	    driver=new SafariDriver();
	    
	    
		//Launching the app
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Identifying and inserting values in username field
	 //   driver.findElement(By.id("user"));
	 
	    
	    
	    
	     driver.findElement(By.name("username")).sendKeys("Admin");
	    
	     driver.findElement(By.name("values")).click();
		//Identifying and inserting values in password field
		//Identifying and clicking Login button 
		
	}

}
