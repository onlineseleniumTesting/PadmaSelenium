package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\New Batches\\Padma USA\\Jar files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("/html/body/a/img")).click();

	}

}
