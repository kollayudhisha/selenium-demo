import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win\\chromedriver.exe");
		    WebDriver driver=(WebDriver) new ChromeDriver();
		    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		    WebElement username=driver.findElement(By.id("txtUsername"));
		    //if username is enabled then i will enter the name
		    if(username.isEnabled())
		    {
		    	//this is to clear the value of an element
		    	username.clear();
		    	username.sendKeys("Admin");
		    	
		    }
		    if(username.isDisplayed())
		    {
		    	//then i want to enter password and click on login if some value is displayed
		    	WebElement pwd=driver.findElement(By.id("txtPassword"));
		    	pwd.clear();
		    	pwd.sendKeys("admin123");
		    	driver.findElement(By.id("btnLogin")).click();
		 		List<WebElement> links=driver.findElements(By.tagName("a"));
		      System.out.println( links.size());
		  for(int i=0;i<links.size();i++)
		  {
			  System.out.println(links.get(i).getText());
		  }
		    }
		    else
		    {
		    	System.out.println("Not displayed");
		    }
	}
	}
