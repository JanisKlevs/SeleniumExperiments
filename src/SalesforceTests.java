import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverInfo;

public class SalesforceTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub C:\Automation\chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://login.salesforce.com"); //Hit url on browser
		//driver.findElement(By.id("username")).sendKeys("aaa");
		//driver.findElement(By.name("pw")).sendKeys("123123");
		driver.findElement(By.cssSelector("#username")).sendKeys("aaa");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("123123");
		
		//driver.findElement(By.className("button r4 wide primary")).click(); //Error. Compound class names not permitted. Ar tuk�umz�m�m nav pie�aujams
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click(); //Dubult�s p�di�as iek� dubult�m p�di��m j�maina uz ''
		System.out.println(driver.getTitle()); //Validate if page title is correct
		System.out.println(driver.getCurrentUrl()); //Validate if link is correct
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		//System.out.println(driver.getPageSource()); //Print page source
		//driver.navigate().to("http://yahoo.com");
		//driver.navigate().back();
		driver.close(); //closes current browser
		//driver.quit(); // It closes all the browsers opened by selenium script
	}

}