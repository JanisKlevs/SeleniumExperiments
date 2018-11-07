import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DesiredCapabilities caps = DesiredCapabilities.internetExplorer();

		//caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		//Pirms izmanto IE - Security tabâ "Internet" un "Restricted sites" izíeksç "Enable protected mode"
		
		System.setProperty("webdriver.ie.driver", "C:\\Automation\\IEDriverServer32.exe");
		WebDriver driver = new InternetExplorerDriver(); 
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());


	}

}
