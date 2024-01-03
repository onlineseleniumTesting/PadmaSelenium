package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acceptcookies {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\New Batches\\Padma USA\\Jar files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/newtours/login.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame("gdpr-consent-notice");
		driver.findElement(By.id("save")).click();

	}

}
