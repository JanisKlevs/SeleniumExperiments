import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(); 
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize() ;
	//use this for drop downs where is used select class
	Select s = new Select(driver.findElement(By.id("month")));
	s.selectByValue("2");
	WebElement option = s.getFirstSelectedOption();
	String selectedItem = option.getText();
	System.out.println(selectedItem );
	//Assert.assertEquals("Feb", selectedItem);
	try {
		   Thread.sleep(5000);
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
	s.selectByIndex(4);
	WebElement option2 = s.getFirstSelectedOption();
	String selectedItem2 = option2.getText();
	System.out.println(selectedItem2 );
	try {
		   Thread.sleep(5000);
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
	s.selectByVisibleText("Oct");
	WebElement option3 = s.getFirstSelectedOption();
	String selectedItem3 = option3.getText();
	System.out.println(selectedItem3 );
	driver.navigate().to("https://spicejet.com/");
	//driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='GOI']")).click();
	//driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	//It is also works But if in code are 2 the same elements see next line how to click on second one
	//driver.findElement(By.cssSelector("a[value='DEL']")).click();
	driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
	
	
	//driver.close();
	}
	

}
