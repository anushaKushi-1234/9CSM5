package KeysEnum;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findElementsEbay {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement footer= driver.findElement(By.id("glbfooter"));
List<WebElement> links=footer.findElements(By.tagName("a"));
for(int i=0;i<links.size();i++) {
	System.out.println(links.get(i).getText());                                                                   
}

	}

}
