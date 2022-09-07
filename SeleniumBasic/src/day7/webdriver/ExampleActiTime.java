package day7.webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleActiTime {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		// implicit waits
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// maximize
		driver.manage().window().maximize();

		// Identify username input field
		WebElement usernameInputField = driver.findElement(By.id("username"));
		usernameInputField.sendKeys("admin");

		// Identify password field
		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");

		// login
		WebElement submitbtn = driver.findElement(By.id("loginButton"));
		submitbtn.click();

		driver.close();

	}

}
