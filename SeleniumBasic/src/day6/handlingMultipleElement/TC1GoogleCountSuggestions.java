package day6.handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1GoogleCountSuggestions {

	public static void main(String[] args) {
		String currentWorkingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//implicit waits
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//maximize
	    driver.manage().window().maximize();
	    
	    //type interview selenium que
	    driver.findElement(By.name("q")).sendKeys("selenium interview questions");
	    
	    List<WebElement> sugg= driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
	    System.out.println("Suggestion count:"+sugg.size());
	    
	    //suggestion count in console
	    for(int i=0; i<sugg.size();i++) {
	    	WebElement element= sugg.get(i);
	    	System.out.println(element.getText());
	    	
	    }
	   // close the browser
	    driver.close();
	}

}
