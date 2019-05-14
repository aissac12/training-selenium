package seleniumwebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver ();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();	//to maximize window
		
		String ExpectedTitle="OrangeHRM";
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("linda.anderson");	//sending "Admin" to username field
		//driver.findElement(By.id("txtUsername"));
		//driver.findElement(By.name("txtUsername"));
		driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson");	//sending "admin123" to password field
		driver.findElement(By.cssSelector("input#btnLogin")).click();	//clicking on "login" button
		String ActualTitle=driver.getTitle();	//getting the actual title of the page
		
		if (ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Then do logout");
			Thread.sleep(3000);
			//driver.findElement(By.id("welcome")).click();
			driver.findElement(By.cssSelector("a#welcome")).click();
			Thread.sleep(3000);
			//driver.findElement(By.linkText("Logout")).click();
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		}
		
		else
		{
			System.out.println("Title is not same");
			
		}
		//driver.close();
		//driver.quit();
	}

}
