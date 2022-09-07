package day6.handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC7Demoblaze {

	public static void main(String[] args) {
		String currentWorkingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		
		//implicit waits
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//maximize
	    driver.manage().window().maximize();
	    
	    //mobile phone count 
	    List<WebElement> mobileCount = driver.findElements(By.cssSelector("div#tbodyid>div>div>div:nth-child(2)>h4"));
	    System.out.println("moible counnt is: "+mobileCount.size());
	    
	    for(int i=0; i<mobileCount.size(); i++) {
	    	WebElement mobileName = mobileCount.get(i);
			System.out.println(mobileName.getText());
	    }
	    
	    driver.close();

	}

}
