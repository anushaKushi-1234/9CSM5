package section1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class launchingchromebrowser {
	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\selenium2nd\\Selenium2\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.flipkart.com/");
	}

}
