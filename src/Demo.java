import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverInfo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub C:\Automation\chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

	}

}
