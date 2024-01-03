package Package1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class KeyPress {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\New Batches\\Padma USA\\Jar files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("onlinerealtimetesting");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
		try {
		driver.findElement(By.name("Passwd")).sendKeys("Padma");
		}catch(Exception e) {
			TakesScreenshot scrShot = ((TakesScreenshot)driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy somewhere
			Files.copy(scrFile, new File("F:\\New Batches\\Padma USA\\screenshot.png"));
		}
	}

}
