package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class partiallinktext_actitime {
	public static void main(String[] args) throws Throwable {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Return")).click();
		driver.close();
	}

}
