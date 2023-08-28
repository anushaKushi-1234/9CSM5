package KeysEnum;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getscreenshotAs {

	public static void main(String[] args) throws IOException {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement foodimage=driver.findElement(By.xpath("//div[@class='_2h2bu']"));
File temp=foodimage.getScreenshotAs(OutputType.FILE);
File permanent=new File("./ElementsSS/foodimage.png");
FileUtils.copyFile(temp, permanent);


	}

}
	