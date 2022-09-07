package day6.handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3Cricinfo {

	public static void main(String[] args) {
		String currentWorkingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		
		//implicit waits
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//maximize
	    driver.manage().window().maximize();
	    
	    //validate home page
	    String homePageTitle = driver.getTitle();
		System.out.println("home page title: "+homePageTitle);
		System.out.println("home page title validation: "+homePageTitle.equals("Live cricket scores, match schedules, latest cricket news, cricket videos"));

		List<WebElement> option= driver.findElements(By.cssSelector("div.ds-flex .ds-flex-row>div>a"));
		System.out.println("Suggestion count:"+option.size());
		
		for(int i=0; i<option.size(); i++) {
			WebElement element= option.get(i);
			System.out.println(element.getText());
		}
		
		driver.close();
	}

}
