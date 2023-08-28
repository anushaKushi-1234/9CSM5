package KeysEnum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class keysenumActiTime {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
			System.out.println("test passed");
			
		}
catch(Exception e){
	System.out.println("test failed");
	
}
		driver.quit(); 
	}

}
