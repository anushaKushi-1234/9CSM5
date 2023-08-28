package KeysEnum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getlocation {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.google.com/");
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement ele=driver.findElement(By.xpath("//img[@alt='Google']"));
Point location= ele.getLocation();
System.out.println("x coordinate: "+location.getX());
System.out.println("Y coordinate: "+location.getY());
	}

}
