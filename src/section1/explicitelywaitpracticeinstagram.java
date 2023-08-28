package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitelywaitpracticeinstagram {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
WebElement loginbutton=driver.findElement(By.xpath("//button[.='Log in']"));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
try {
	wait.until(ExpectedConditions.elementToBeClickable(loginbutton)).click();
	System.out.println("login button enabled");
}
catch(Exception e){
	System.out.println("login button disabled");
}
driver.findElement(By.name("username")).sendKeys("98765432134");
driver.findElement(By.name("password")).sendKeys("98765234");

try {
	wait.until(ExpectedConditions.elementToBeClickable(loginbutton)).click();
	System.out.println("login button enabled");
	
}
catch (Exception e) {
	System.out.println("login button disabled");
}
	}

}
