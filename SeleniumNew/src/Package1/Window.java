package Package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\New Batches\\Padma USA\\Jar files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterate=winids.iterator();
		System.out.println("The main window is:"+iterate.next());
		
		driver.findElement(By.xpath("//a[@title=\"Linked In\"]")).click();
		Thread.sleep(8000);
		System.out.println("*****AFter the new window opens*****");
		winids = driver.getWindowHandles();
		iterate=winids.iterator();
		String firstWindow = iterate.next();
		String secondWindow = iterate.next();
		System.out.println("The main window is:"+firstWindow);
		System.out.println("The child window is:"+secondWindow);
		driver.switchTo().window(secondWindow);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[data-tracking-control-name=\"organization_guest_nav-header-signin\"]")).click();
		driver.close();
		driver.switchTo().window(firstWindow);
		driver.close();
	}

}
