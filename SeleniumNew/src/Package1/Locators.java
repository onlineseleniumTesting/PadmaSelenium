package Package1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\New Batches\\Padma USA\\Jar files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		WebElement ele = driver.findElement(By.name("country"));
//		
//		Select sel = new Select(ele);
//		//sel.selectByValue("INDIA");
//		sel.selectByIndex(4);
		
		WebElement ele = driver.findElement(By.name("country"));
		List<WebElement> list = ele.findElements(By.tagName("option"));
		System.out.println(list.size());
		
		for(WebElement i:list) {
			System.out.println(i.getText());
			if(i.getText().equals("INDIA")) {
				i.click();
			}
		}
		
		
		
		driver.findElement(By.cssSelector("input[name^=\"confirm\"]")).sendKeys("Padma");
	}

}
