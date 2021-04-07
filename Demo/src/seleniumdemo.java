import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win\\chromedriver.exe");
		  WebDriver driver=(WebDriver) new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			String beforetitle=driver.getTitle();
			System.out.println(beforetitle);
		     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		     driver.findElement(By.id("btnLogin")).click();
		     String aftertitle=driver.getTitle();
		     System.out.println(aftertitle);
		     if(beforetitle.equals(aftertitle))
				{
					System.out.println("Title is same please logout");
					driver.findElement(By.id("welcome")).click();
					//i want to wait between two clicks
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
					Thread.sleep(3000);
					//if i want to close the browser
					driver.close();
				}
				else
				{
					System.out.println("Title is not same");
					driver.close();
				}
	  }
		     
}
