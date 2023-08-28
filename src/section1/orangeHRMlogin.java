package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class orangeHRMlogin {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
