package section1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchingfirefoxdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium folder\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
	}
}
