package day6.handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2Flipcart {

	public static void main(String[] args) throws InterruptedException {
		String currentWorkingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//implicit waits
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//maximize
	    driver.manage().window().maximize();
	    
	    //validate home page
	    String homePageTitle = driver.getTitle();
		System.out.println("home page title: "+homePageTitle);
		System.out.println("home page title validation: "+homePageTitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
	    
		Thread.sleep(2000);
		
		List<WebElement> menuCount= driver.findElements(By.cssSelector("div._37M3Pb img"));
		System.out.println("Suggestion count:"+menuCount.size());
		List<WebElement> menuName= driver.findElements(By.cssSelector("div._37M3Pb>div>a>div"));
		
		for(int i=0; i<menuName.size(); i++) {
			WebElement element= menuName.get(i);
			System.out.println(element.getText());
			
		}
	
		driver.close();
	}
	

}
