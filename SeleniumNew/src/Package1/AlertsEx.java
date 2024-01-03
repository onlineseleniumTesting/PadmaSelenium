package Package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\New Batches\\Padma USA\\Jar files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Bank Project")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
//		boolean b = driver.findElements(By.name("sumit")).size()!=0;
//		System.out.println(b);
//		if(b==true) {
//			System.out.println("pass");
//		}else {
//			System.out.println("fail");
//		}
//				
//		driver.findElement(By.name("submit")).click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
		driver.switchTo().defaultContent();
		
		

	}

}
