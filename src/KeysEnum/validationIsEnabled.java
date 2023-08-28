package KeysEnum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class validationIsEnabled {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.instagram.com/");
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement loginButton=driver.findElement(By.xpath("//button[.='Log in']"));
if(loginButton.isEnabled())
System.out.println("enabled");
else
	System.out.println("disbled");

driver.findElement(By.name("username")).sendKeys("12987654332");
driver.findElement(By.name("password")).sendKeys("3456876");
if(loginButton.isEnabled())
{
System.out.println("enabled");
loginButton.click();
	}
else
	System.out.println("disbled");

	}

}
