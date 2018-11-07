//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
