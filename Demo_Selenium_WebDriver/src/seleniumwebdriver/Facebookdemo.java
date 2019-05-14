package seleniumwebdriver;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookdemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver ();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		//WebElement label = driver.findElement(By.xpath("//*/tbody/tr/td"));
		//System.out.println(label.getText());
		
		System.out.println(driver.findElement(By.xpath("//*[@name='email']//parent::td//parent::tr//preceding-sibling::tr//td/label")).getText());
        driver.findElement(By.xpath("//*[@name='email']//parent::td//parent::tr//following-sibling::td/input[@name='pass']"));	
        System.out.println(driver.findElement(By.xpath("//*[@name='pass']//parent::td//parent::tr//preceding-sibling::tr//td[2]/label")).getText());
      
        //click on login
        
	}

}
