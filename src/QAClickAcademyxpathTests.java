//package Tests;

//import java.util.List;

//import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class QAClickAcademyxpathTests {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(); 
driver.get("http://www.qaclickacademy.com/interview.php");
driver.manage().window().maximize() ;
driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
//driver.sleep(15);
//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
try {
	   Thread.sleep(5000);
	} catch (InterruptedException e) {
	   e.printStackTrace();
	}
driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
//try {
//	   Thread.sleep(5000);
//	} catch (InterruptedException e) {
//	   e.printStackTrace();
//	}
System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
//
driver.close();
}
}