import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class project1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win\\chromedriver.exe");
		    WebDriver driver=(WebDriver) new ChromeDriver();
		    driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		    WebElement username=driver.findElement(By.name("userName"));
		    if(username.isEnabled())
		    {
		    	//this is to clear the value of an element
		    	username.clear();
		    	username.sendKeys("Sunil");
		    	
		    }
		    if(username.isDisplayed())
		    {
		    	//then i want to enter password and click on login if some value is displayed
		    	WebElement pwd=driver.findElement(By.name("password"));
		    	pwd.clear();
		    	pwd.sendKeys("Sunil");
		    	driver.findElement(By.name("submit")).click();
		    }
		    		driver.findElement(By.xpath("//*[@href='reservation.php']")).click();
		    		driver.findElement(By.xpath("//*[@name='tripType'][2]")).click();




}
}