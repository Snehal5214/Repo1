package day6.handlingMultipleElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6Facebook {

	public static void main(String[] args) {String currentWorkingDir = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//implicit waits
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//maximize
    driver.manage().window().maximize();
    
    //validation of home page
    String homePageTitle = driver.getTitle();
    System.out.println("home page title: "+homePageTitle);
    System.out.println("home page title validation is: "+homePageTitle.equals("Facebook – log in or sign up"));
    
   driver.findElement(By.cssSelector("div._6ltg>a")).click();
   
   //visible date
   WebElement date = driver.findElement(By.id("day"));
   System.out.println("date visibility is: "+date.isDisplayed());
   System.out.println("date enablility is: "+date.isEnabled());
   
   //month visible
   WebElement month = driver.findElement(By.id("month"));
   System.out.println("month visibility is : "+month.isDisplayed());
   System.out.println("month enablility is: "+month.isEnabled());
   
   // year visibility
   WebElement year = driver.findElement(By.id("year"));
   System.out.println("year visibility is : "+year.isDisplayed());
   System.out.println("year enablility is: "+year.isEnabled());
		
			
	}
}
