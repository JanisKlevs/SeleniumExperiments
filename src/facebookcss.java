import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.facebook.com"); //Hit url on browser
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("my own css - email");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("my own css - pass");
		//driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.findElement(By.cssSelector("label#loginbutton")).click(); //tagname#id
		System.out.println(driver.getTitle()); //Validate if page title is correct
		System.out.println(driver.getCurrentUrl()); //Validate if link is correct
		driver.close();
		
	}

}
