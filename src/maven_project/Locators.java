package first.maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\hiba.ahmed\\Downloads\\geckodriver-v0.33.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.python.org/");
		//driver.get("https://demo.guru99.com/test/link.html");
		//driver.get("https://magento.softwaretestingboard.com/");
		
		//driver.manage().window().maximize();
		
		//ID Locator
		//driver.findElement(By.id("id-search-field")).sendKeys("testing");
		
		//Name Locator
		//driver.findElement(By.name("q")).sendKeys("testing");
		
		//Class Name Locator
	    //driver.findElement(By.className("search-button")).click();
		
		//Tag Name Locator
		//driver.findElement(By.tagName("button")).click();
		
		//Link Text Locator 
		//driver.findElement(By.linkText("click here")).click();
		
		//Partial Link Text Locator
		//driver.findElement(By.partialLinkText("click")).click();
		
		//////////////CSS Selector Locator////////// -- create syntax
		//(diff ways to make CSS Locators)
		
		//method 1 (#id)
		//driver.findElement(By.cssSelector("#search")).sendKeys("testing");
	
		//method 2 (tagname.classname)
		//driver.findElement(By.cssSelector("div.minicart-wrapper")).click();
		
		//method 3 (tagname#ID)
		//driver.findElement(By.cssSelector("input#search")).sendKeys("testing");
		
		//method 4 (tagname[attribute='value'])
		//driver.findElement(By.cssSelector("div[data-block='minicart']")).click();
		
		////////////////XPATH Locator///////////////
		
		//ABSOLUTE PATH - (starts from root)
		//driver.findElement(By.xpath("/html/body[1]/div[1]/div[1]/header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
		//Thread.sleep(2000);
		
		//RELATIVE PATH - (directly get element) -- syntax
		//syntax 1: //tagname[@attribute = 'value']
		//driver.findElement(By.xpath("//img[@class = 'wp-image-218123']")).click();
		
		//syntax 2: //tagname[contains([@class ,’value’)] -- syntax
		driver.get("https://ultimateqa.com/");
		driver.findElement(By.xpath("//img[@class = 'wp-image-218123']")).click();
		
		driver.close();

	}
}
