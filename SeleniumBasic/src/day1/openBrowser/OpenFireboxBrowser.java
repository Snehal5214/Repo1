package day1.openBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireboxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "H:\\workplace\\SeleniumBasic\\Executables\\geckodriver.exe");
		
		FirefoxDriver frd = new FirefoxDriver();
		
		frd.get("https://www.google.com");

	}

}
