package seleniumwebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class demoooo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver ();
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("www.google.com");
		driver.manage().window().maximize();

	}

}
