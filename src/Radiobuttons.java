import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		//System.out.println(driver.findElement(By.xpath("//input[@value='Butter']")).getText());
		//show how many items 
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		//in get() can input whichs one need click by index in this list, 0,1,2 or i
		for (int i=0; i<count; i++)
		{
			//click all radiobuttons in this group
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			
			//In this way can click on radiobutton without value in xpath 
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (text.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		
	}

}
