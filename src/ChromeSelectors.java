import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverInfo;

public class ChromeSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub C:\Automation\chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.facebook.com"); //Hit url on browser
		driver.findElement(By.id("email")).sendKeys("aaa");
		driver.findElement(By.name("pass")).sendKeys("123123");
		driver.findElement(By.linkText("Forgot password?")).click();
		System.out.println(driver.getTitle()); //Validate if page title is correct
		System.out.println(driver.getCurrentUrl()); //Validate if link is correct
		//System.out.println(driver.getPageSource()); //Print page source
		//driver.navigate().to("http://yahoo.com");
		//driver.navigate().back();
		driver.close(); //closes current browser
		//driver.quit(); // It closes all the browsers opened by selenium script
	}

}