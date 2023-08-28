package KeysEnum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getTextattributeTagName {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.snapdeal.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


WebElement searchTF=driver.findElement(By.className("searchformButton"));

System.out.println(searchTF.getTagName());
System.out.println(searchTF.getText());
System.out.println(searchTF.getAttribute("class"));
System.out.println(searchTF.getCssValue("font"));
System.out.println(searchTF.getCssValue("background-color"));
System.out.println(searchTF.getCssValue("color"));
	}

}
