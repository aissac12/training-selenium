package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Democase {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver ();
	
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		String underConstruction = "Under Construction: Mercury Tours";
		List<WebElement> link = driver.findElements(By.tagName("a"));//list is used since its not just one weblement and store all webelements in "link"
		String[] linktext = new String[link.size()];
		int i=0;
		//extrack the link text of each link element
		for (WebElement e: link)
		{
			linktext[i]=e.getText();
			i++;
		}
		//test whether each link is working or not
		for (String t:linktext)	//storing all linktext in "t"
		{
			Thread.sleep(2000);
			driver.findElement(By.linkText(t)).click();
			//if(driver.getTitle().equals(underConstruction))
			if(driver.getTitle().contains(underConstruction))
			{
				System.out.println("\"" + t+ "\"" + "\"  is under construction");
			}
			else
			{
				System.out.println("\"" + t+ "\"" + "\"  is working");
			}
			
			driver.navigate().back();
			//driver.navigate().forward();
		
		}
		
		driver.quit();
		
	
	}

}
