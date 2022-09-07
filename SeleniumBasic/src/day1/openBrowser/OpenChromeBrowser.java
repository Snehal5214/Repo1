package day1.openBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
	 
		System.setProperty("webdriver.chrome.driver", "H:\\workplace\\SeleniumBasic\\Executables\\chromedriver.exe");
		
		ChromeDriver cdriver = new ChromeDriver();
		
		cdriver.get("https://www.google.com");
		
		
		

	}

}
