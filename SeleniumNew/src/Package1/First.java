package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\New Batches\\Padma USA\\Jar files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("Padma");
		driver.findElement(By.name("lastName")).sendKeys("Testing");
		driver.findElement(By.id("email")).sendKeys("kumar");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("sign-in")).click();
		driver.findElement(By.partialLinkText("sign")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
