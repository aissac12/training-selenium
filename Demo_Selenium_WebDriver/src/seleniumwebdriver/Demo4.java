package seleniumwebdriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver ();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("linda.anderson");
		String Value = driver.findElement(By.id("txtUsername")).getAttribute("value"); 
		System.out.println(Value);
		//gettext for drop down,getattributes for elements-can be used for value,id,etc
		driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson");	//sending "admin123" to password field
		//driver.findElement(By.cssSelector("input#btnLogin")).click();
		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Performance")).click();	//not working
		//Thread.sleep(3000);
		driver.findElement(By.partialLinkText("My In")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.partialLinkText("Perfo")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[contains(text(),'Performance')]")).click();	//a used instead of *
		//Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("Recru")).click();
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement e:links)
		{
			String linktext = e.getText();
			System.out.println(linktext);
		}
		

	}

}
