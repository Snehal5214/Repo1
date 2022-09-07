package day6.handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5gsmarenaSamsung {

	public static void main(String[] args) {
		String currentWorkingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		
		//implicit waits
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//maximize
	    driver.manage().window().maximize();
	    
	    //validate home page
	    String homePageTitle = driver.getTitle();
		System.out.println("home page title: "+homePageTitle);
		System.out.println("home page title validation: "+homePageTitle.equals("GSMArena.com - mobile phone reviews, news, specifications and more..."));
		
		//click on samsung phone link present in the phone finder
		driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']")).click();
		
		List<WebElement> deviceCount= driver.findElements(By.cssSelector("div.makers>ul>li>a>strong>span"));
		System.out.println("Suggestion device Count:"+deviceCount.size());
		
		for(int i=0; i<deviceCount.size(); i++) {
			WebElement PhoneName= deviceCount.get(i);
			System.out.println(PhoneName.getText());	
		}
		//close the browser
		//driver.close();
	}

}
