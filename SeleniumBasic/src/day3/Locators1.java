package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		String currentWorkingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//application title validation
				String actualTitle = driver.getTitle();
				String expectedTitle = "OrangeHRM";
				System.out.println("actual google page title: "+actualTitle);
				System.out.println("expected google page title: "+expectedTitle);
				System.out.println("Google title validation: "+actualTitle.equals(expectedTitle));
				
				//validation of url
				String actualUrl = driver.getCurrentUrl();
				String expectedUrl= "https://opensource-demo.orangehrmlive.com/";
				System.out.println("actual url is: "+actualUrl);
				System.out.println("expected url is: "+expectedUrl);
				System.out.println("Google url validation is: "+actualUrl.contains(expectedUrl));
				
				//page source code
				String pageSource = driver.getPageSource();
				System.out.println("Page source code content length: "+pageSource.length());
				
				WebElement username = driver.findElement(By.id("txtUsername"));
				//username.clear();
				username.sendKeys("Admin");
				WebElement pwd = driver.findElement(By.id("txtPassword"));
				pwd.sendKeys("admin123");
				WebElement submitbtn = driver.findElement(By.className("button"));
				submitbtn.click();
				
				//close the current browser
				//driver.close();
				
				
				


	}

}
