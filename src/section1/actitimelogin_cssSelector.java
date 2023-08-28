package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class actitimelogin_cssSelector {
	
	public static void main(String[] args) throws Throwable {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("a[class='initial']")).click();
		
		Thread.sleep(3000);
		
        driver.findElement(By.cssSelector("div[id='container_tasks']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("a[class='content reports']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("a[class='content users']")).click();
        
        driver.close();
	}

}
