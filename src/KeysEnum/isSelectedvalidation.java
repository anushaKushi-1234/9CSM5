package KeysEnum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isSelectedvalidation {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		if(checkbox.isSelected())
			System.out.println("selected");
		else
			System.out.println("not selected");

		checkbox.click();
		if(checkbox.isSelected())
			System.out.println("selected");
		else
			System.out.println("not selected");
		
	}

}