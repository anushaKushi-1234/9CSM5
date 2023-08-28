package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setsizelocationandrefresh {
	public static void main(String[] args) throws Throwable {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\seleniumserver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.myntra.com/");
		Thread.sleep(4000);
		
		driver.get("https://www.ajio.com/");
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.navigate().forward();
		Thread.sleep(4000);
		
		driver.manage().window().setSize(new Dimension(300, 400));
		Thread.sleep(4000);
		
		driver.manage().window().setPosition(new Point(400, 300));
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		
		driver.close();
	}

}
