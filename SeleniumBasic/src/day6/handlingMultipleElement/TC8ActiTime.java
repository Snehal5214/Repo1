package day6.handlingMultipleElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC8ActiTime {

	public static void main(String[] args) throws InterruptedException {
		String currentWorkingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		//implicit waits
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//maximize
	    driver.manage().window().maximize();
		
		//Identify username input field
		WebElement usernameInputField = driver.findElement(By.id("username"));
		usernameInputField.sendKeys("admin");
		
		//Identify password field
		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");
		
	    //login
		WebElement submitbtn = driver.findElement(By.id("loginButton"));
		submitbtn.click();
		
		Thread.sleep(2000);
		//click on task
		driver.findElement(By.cssSelector("#container_tasks")).click();
		//click on add new
		driver.findElement(By.cssSelector("div.addNewButton>div:nth-child(2)")).click();
		//click on new task
		driver.findElement(By.cssSelector("div.dropdownContainer.addNewMenu>div:nth-child(3)")).click();
		//click on customer
		driver.findElement(By.cssSelector(".customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer .selectedItem")).click();
		//click on 
		driver.findElement(By.cssSelector(".scrollableDropdownView div:nth-child(4)")).click();
		
		//click on product
		driver.findElement(By.cssSelector(".emptySelection")).click();
		
		//click on android testing
		driver.findElement(By.cssSelector(".projectSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>.components_combobox.cpCombobox>.scrollableDropdownView>.scrollableContainer>.contentWrapper>.searchItemList>:nth-child(5)")).click();
	    driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Man-Made");
		
		//click on create task
	    driver.findElement(By.cssSelector(".basicLightboxFooter>.buttonsBox>.commitButtonPlaceHolder>.components_button.withPlusIcon>.components_button_label")).click();
	    
	    //click on box
	   driver.findElement(By.cssSelector(".taskRow.noLastTrackingDate>td>div>div")).click();
	   //click on delete
	   driver.findElement(By.cssSelector(".bulkOperationsPanel>.delete.button")).click();
		
		
		
	}
}
