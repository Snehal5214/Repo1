package day4.syn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		String currentWorkingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//username field
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		System.out.println("username is: "+username);
		System.out.println("username is functional or not? "+username.isDisplayed());
		 
		String defaultValueOfUsernameField = username.getAttribute("type");
		System.out.println("default value of username field is "+defaultValueOfUsernameField);
		System.out.println("default value of username field is "+defaultValueOfUsernameField.equals("text"));
		
		//password field
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		System.out.println("password is "+password);
		System.out.println("password is functional or not? "+password.isDisplayed());
		
		String defaultValueOfPasswordField = password.getAttribute("autocomplete");
		System.out.println("default value of the password is "+defaultValueOfPasswordField);
		System.out.println("default value of the passsword is "+defaultValueOfPasswordField.equals("off"));
		
		WebElement login = driver.findElement(By.name("Submit"));
		login.click();
		
		//explicit wait
		Thread.sleep(20000);
		
		//home page validation by url
		String homePageUrl= driver.getCurrentUrl();
		System.out.println("home page url: "+homePageUrl);
		System.out.println("validation of home page url: "+homePageUrl.contains("dashboard"));
		
		//home page validation by title
		String homePageTitle = driver.getTitle();
		System.out.println("home page title is: "+homePageTitle);
		System.out.println("validation of home page title is: "+homePageTitle.contains("OrangeHRM"));
	
		//LOGOUT
	    driver.findElement(By.id("welcome")).click();
	    driver.findElement(By.linkText("Logout")).click();
		
	    //close the browser
	    driver.close();
	    
		

	}

}
