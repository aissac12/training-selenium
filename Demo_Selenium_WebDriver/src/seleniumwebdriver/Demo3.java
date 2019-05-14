package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver ();
			
			driver.get("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			WebElement username = driver.findElement(By.name("userName"));	//webelement is used to store the element username
			if(username.isEnabled())
			{
				username.sendKeys("sunil");
				username.clear();
				username.sendKeys("sunil");
			}
			if (driver.findElement(By.name("userName")).isDisplayed())
			{
				driver.findElement(By.name("password")).sendKeys("sunil");
				driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click(); 
			}
			Thread.sleep(3000);
			if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected()) 
			{
				
				driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click(); 
			}
			
				//Thread.sleep(5000);
				WebElement DD = driver.findElement(By.name("passCount"));
				Select sel =new Select(DD);
				List<WebElement> data = sel.getOptions(); //import java.util..data is a variable that stores all options of drop down
				for(int i=0;i<data.size();i++)
				{
					System.out.println(data.get(i).getText());	//to get the drop down options
				}
				sel.selectByValue("2");
				System.out.println(data.size());	//size is not a method,just an action item 
				
				/*WebElement DE = driver.findElement(By.name("fromPort"));
				Select sel1 =new Select(DE);
				List<WebElement> data1 = sel1.getOptions();
				for(int j=0;j<data1.size();j++)
				{
					System.out.println(data1.get(j).getText());	//to get the drop down options
				}
				sel1.selectByValue("London");
				System.out.println(data1.size());*/
				
				driver.findElement(By.xpath("//*[@name='servClass' and @value ='Business']"));
				driver.findElement(By.name("findFlights")).click();
				driver.findElement(By.name("reserveFlights")).click();
				
				driver.findElement(By.xpath("//*[@name='passFirst0']")).sendKeys("Anandhu");
				driver.findElement(By.xpath("//*[@name='passLast0']")).sendKeys("Udayan");
				driver.findElement(By.xpath("//*[@name='cc_frst_name']")).sendKeys("Ancy");
				driver.findElement(By.xpath("//*[@name='cc_mid_name']")).sendKeys("Issac");
				
				driver.findElement(By.xpath("//*[@name='creditnumber']")).sendKeys("7736256424");
				
				//driver.findElement(By.xpath("//*[@name='ticketLess' and @value='checkbox' and @type='checkbox']")).click();
				//driver.findElement(By.xpath("//*[@name='ticketLess' and @value='checkbox' and @type='checkbox']")).click();
					//both are checkboxes have same Attributes so use webelement
				
				//getattribute for edit box,gettext for drop down,getoptions for grtting options in dropdown
				
				List<WebElement> checkbox  = driver.findElements(By.name("ticketLess"));
				for(WebElement e:checkbox)		//try with i,i<2,i++
				{
					e.click();
				}
				
				
			
 
	}

}
