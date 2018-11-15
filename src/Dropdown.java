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
		   Thread.sleep(1000);
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
	s.selectByIndex(4);
	WebElement option2 = s.getFirstSelectedOption();
	String selectedItem2 = option2.getText();
	System.out.println(selectedItem2 );
	try {
		   Thread.sleep(1000);
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
	//It is also works But if in code are 2 the same elements see next line how to click on second one. Need add index in this line
	//driver.findElement(By.cssSelector("a[value='DEL']")).click();
	driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
	//with absolute xpath
	//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/a[1]")).click();
	//tagName[contains(@attribute,’value’)] ui-state-default ui-state-highlight ui-state-active
	//with part of value
	driver.findElement(By.xpath("//a[contains(@class, 'ui-state-active')]")).click();
	try {
		   Thread.sleep(1000);
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
	
	//can validate checkbox with this method
	System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	
	//ctl00_mainContent_chk_friendsandfamily
	System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	
	
	//driver.close();
	}
	

}
