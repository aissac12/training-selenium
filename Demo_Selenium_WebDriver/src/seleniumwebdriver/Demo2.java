package seleniumwebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo2{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver ();
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())	//checking if roundtrip is selected
		{
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();	//then select oneway
		}
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		

	}

}
