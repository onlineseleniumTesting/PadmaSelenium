package Package1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutorEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\New Batches\\Padma USA\\Jar files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnLogin")));
		button.click();
		}catch(Exception e) {
		driver.quit();
		}
		
		
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("window.scrollBy(0,1000)");
//		//js.executeScript("arguments[0].click();", button);
		
		
	}

}
