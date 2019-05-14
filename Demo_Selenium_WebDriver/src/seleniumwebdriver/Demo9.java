package seleniumwebdriver;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo9 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver ();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL));
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList <>(driver.getWindowHandles());
		System.out.println("no of tabs :" + tabs.size());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(tabs.get(0));
		
		System.out.println(driver.getTitle());
		

	}

}
