package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Actitimelogin {

	public static void main(String[] args) throws Throwable {
		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option); 
		Thread.sleep(3000);
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		WebElement ele=	driver.findElement(By.name("username"));
	    ele.sendKeys("admin");
	    Thread.sleep(3000);
	
	    WebElement ele1=driver.findElement(By.name("pwd"));
	    ele1.sendKeys("manager");
		Thread.sleep(3000);
		
	WebElement ele2=driver.findElement(By.className("initial"));
	ele2.click();
	}

}
