package seleniumwebdriver;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTable {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver ();
		driver.get("file:///C:/Users/IBM_ADMIN/Desktop/java/demo.html");
		//driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//*/tbody/tr[2]/td")).getText());
		System.out.println(driver.findElement(By.xpath("//*/tbody/tr/td/parent::td//parent::trpreceding-sibling::tr//td[2]")).getText());
		
				
		//System.out.println(driver.findElement(By.xpath("//*[@name='email']//parent::td//parent::tr//preceding-sibling::tr//td/label")).getText());
		
	}

}
