import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverInfo;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub C:\Automation\chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://rediff.com"); //Hit url on browser
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[title*='Sign in'")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("password");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		driver.close(); //closes current browser
		//driver.quit(); // It closes all the browsers opened by selenium script
	}

}