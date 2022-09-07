package day6.handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4gsmarena {

	public static void main(String[] args) throws InterruptedException {
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
		
		Thread.sleep(2000);
		
		List<WebElement> phoneName= driver.findElements(By.cssSelector("aside>div.brandmenu-v2.light.l-box.clearfix>ul>li>a"));
		System.out.println("phone name count:"+phoneName.size());
		for(int i=0; i<phoneName.size(); i++) {
			WebElement name= phoneName.get(i);
			System.out.println(name.getText());			
		}
		//close the browser
		driver.close();
	}

}
