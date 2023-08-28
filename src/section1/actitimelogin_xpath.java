package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class actitimelogin_xpath {
	public static void main(String[] args) throws Exception {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	
		
	}

}
