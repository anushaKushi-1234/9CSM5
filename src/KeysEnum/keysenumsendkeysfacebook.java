package KeysEnum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class keysenumsendkeysfacebook {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.linkText("Forgotten password?")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
	}

}
