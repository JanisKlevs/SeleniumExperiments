import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(); 
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize() ;
	Select s = new Select(driver.findElement(By.id("month")));
	s.selectByValue("2");
	try {
		   Thread.sleep(5000);
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
	s.selectByIndex(4);
	try {
		   Thread.sleep(5000);
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
	s.selectByVisibleText("Oct");
	//driver.navigate().to("http://yahoo.com");
	
	}
	

}
