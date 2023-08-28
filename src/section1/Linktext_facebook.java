package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Linktext_facebook {
	public static void main(String[] args) throws Throwable {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
