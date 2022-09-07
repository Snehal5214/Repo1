package day6.handlingMultipleElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC9Vtiger {

	public static void main(String[] args) {
		String currentWorkingDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("username")).sendKeys("Admin");
		//driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.className("button")).click();
		
		 driver.manage().window().maximize();
		 
		//add widget- lead by status
		   driver.findElement(By.cssSelector(".addButton")).click();
		   driver.findElement(By.cssSelector("a[data-name='LeadsByStatus']")).click();
		   
		    //add widget-sales pipeline
		   driver.findElement(By.cssSelector(".addButton")).click();
		   driver.findElement(By.cssSelector("a[data-name='PipelinedAmountPerSalesPerson']")).click();
		   
		   //add widget- total revenue
	       /*driver.findElement(By.cssSelector(".addButton")).click();
		   driver.findElement(By.cssSelector("a[data-name='TotalRevenuePerSalesPerson']")).click();*/
		   
		   //delete lead by status
		   driver.findElement(By.cssSelector(".new.dashboardWidget.loadcompleted.gs-w .widget")).click();
		   
		   driver.navigate().refresh();
		   driver.navigate().refresh();
		   
		   //click on delete of lead by status
		   driver.findElement(By.cssSelector(".dashboardWidget.dashboardWidget_0.gs-w.loadcompleted .dashBoardWidgetFooter .widget>.fa.fa-remove")).click();
		   driver.findElement(By.cssSelector(".modal-content>.modal-footer>.confirm-box-ok")).click();
		   
		   //click on delete ofsales pipeline
		   driver.findElement(By.cssSelector(".dashboardWidget.dashboardWidget_0.gs-w.loadcompleted .widget>.fa.fa-remove")).click();
		   driver.findElement(By.cssSelector(".modal-dialog>.modal-content>.modal-footer>.confirm-box-ok.confirm-box-btn-pad.btn-primary")).click();
		   
		   driver.navigate().refresh();
		   driver.navigate().refresh();

		   driver.close();
	}

}
