package javaprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTrip1 {
	String url="https://www.makemytrip.com/";
	String oneway="//span[@class='tabsCircle appendRight5']/parent::li[@data-cy=\"oneWayTrip\"]";
	String popup="//div[@id='root']";
	String from="//input[@class=\"react-autosuggest__input react-autosuggest__input--open\"]";
	String mumbai="//div[@class=\"makeFlex hrtlCenter\"]/div/p[text()='Mumbai, India']";
	
	@Test
	
	public void test() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\RadicalAnilSir\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(oneway));
		
		//driver.findElement(By.xpath(from)).clear();;
		
		driver.findElement(By.xpath(from)).click();
		
		driver.findElement(By.xpath(popup)).click();
		
		driver.findElement(By.xpath(from)).sendKeys("mumbai");;
		
		driver.findElement(By.xpath(mumbai)).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
