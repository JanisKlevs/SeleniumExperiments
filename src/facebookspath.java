import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookspath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.facebook.com"); //Hit url on browser
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("my own xpath - email");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("my own xpath - pass");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println(driver.getTitle()); //Validate if page title is correct
		System.out.println(driver.getCurrentUrl()); //Validate if link is correct
		driver.close();
		
	}

}
