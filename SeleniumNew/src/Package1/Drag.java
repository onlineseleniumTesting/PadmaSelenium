package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\New Batches\\Padma USA\\Jar files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.dragAndDrop(drag, drop).perform();
		//action.dragAndDropBy(drop, 90, 0);
		

	}

}
