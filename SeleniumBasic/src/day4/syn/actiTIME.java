package day4.syn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTIME {

	public static void main(String[] args) throws InterruptedException {
		String currentWorkingDir = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
			
		//define implicit wait for browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Identify username input field
		WebElement usernameInputField = driver.findElement(By.id("username"));
		System.out.println("Username is: "+usernameInputField);
		System.out.println("username is functional or not?: "+usernameInputField.isDisplayed());
		usernameInputField.sendKeys("admin");
		
		//default value in username 
		String defaultValueInUserNameInputField = usernameInputField.getAttribute("placeholder");
		System.out.println("defaultValueInUserNameInputField is: "+defaultValueInUserNameInputField);
		System.out.println("defaultValueInUserNameInputField status is: "+defaultValueInUserNameInputField.equals("Username"));
		
		//Identify password field
		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		System.out.println("password is: "+passwordInputField);
		System.out.println("password is functional or not?: "+passwordInputField.isDisplayed());
		passwordInputField.sendKeys("manager");
		
		//default value in password
		String defaultValueInPasswordInputField = passwordInputField.getAttribute("placeholder");
		System.out.println("defaultValueInPasswordInputField is: "+defaultValueInPasswordInputField);
		System.out.println("defaultValueInPasswordInputField status is: "+defaultValueInPasswordInputField.equals("Password"));
		
		WebElement submitbtn = driver.findElement(By.id("loginButton"));
		submitbtn.click();
		
		//explicit Wait(static wait)
		Thread.sleep(2000);
		
		//Home page url validation
		String HomePageUrl = driver.getCurrentUrl();
		System.out.println("home page url validation: "+HomePageUrl.contains("do"));
		
		//home page title validation
		String homePageTitle = driver.getTitle();
		System.out.println("home page title: "+homePageTitle);
		System.out.println("home page title validation: "+homePageTitle.equals("actiTIME - Enter Time-Track"));
		
		//logout
		WebElement logout = driver.findElement(By.id("logoutLink"));
		logout.click();		
		
		//keep me log in check box
		WebElement keepMeLogInBoxText = driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println(keepMeLogInBoxText.isDisplayed());
		System.out.println(keepMeLogInBoxText.isEnabled());
		String checkBoxTextName = keepMeLogInBoxText.getText();
		System.out.println(checkBoxTextName);
		
		//close the current browser
		driver.close();

		
		
		
		
		

	}

}
