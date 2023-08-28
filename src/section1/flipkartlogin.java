package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flipkartlogin {

	public static void main(String[] args) throws Throwable {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver(option);
	
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("iphone 11");
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	driver.close();
	}

}
