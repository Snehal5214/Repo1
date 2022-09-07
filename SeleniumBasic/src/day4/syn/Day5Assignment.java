package day4.syn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5Assignment {

	public static void main(String[] args) {
		String currentWorkingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//implicit waits
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*//username 
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//password
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
	    driver.findElement(By.id("password")).sendKeys("Test@123");*/
	    
	    //login
	    WebElement login = driver.findElement(By.className("button"));
	    login.click();
	    //maximize
	    driver.manage().window().maximize();
	    
	   /* //validate home page by title
	    String homePageTitle = driver.getTitle();
	    System.out.println("homePageTitle is: "+ homePageTitle);
	    System.out.println("homePageTitle validation is: "+ homePageTitle.equals("Dashboard"));*/
	    
	    //add widget- lead by status
	   driver.findElement(By.cssSelector(".addButton")).click();
	   driver.findElement(By.cssSelector("a[data-name='LeadsByStatus']")).click();
	   
	    //add widget-sales pipeline
	   driver.findElement(By.cssSelector(".addButton")).click();
	   driver.findElement(By.cssSelector("a[data-name='PipelinedAmountPerSalesPerson']")).click();
	   
	   //add widget- total revenue
	   driver.findElement(By.cssSelector(".addButton")).click();
	   driver.findElement(By.cssSelector("a[data-name='TotalRevenuePerSalesPerson']")).click();
	   
	   //click on user profile
	   driver.findElement(By.cssSelector(".userName")).click();
	   driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
	}

}
