package first.maven_project;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","C:\\Users\\hiba.ahmed\\Downloads\\geckodriver-v0.33.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//driver.manage().window().maximize();
		
		//how to print window handle using "getwindowHandle"
//String parentHandle	 = driver.getWindowHandle();
		//System.out.println(parentHandle);
		
		//how to print multiple handles using "getwindowHandles"
//driver.findElement(By.id("newWindowBtn")).click();
		//how to print a childhandle
//Set<String> handles = driver.getWindowHandles();
		//System.out.println(handles);
//driver.close();
		
		/*for(String handle: handles)
		{
			if (handle != parentHandle)
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("child window");
				Thread.sleep(2000);
			}
		}
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("parent window");
		Thread.sleep(2000); */
		
	
		 /////////////iFRAMES//////////////
		
		//if an element is under an iframe, then we access iframe first then an element 
		driver.get("https://blogpendingtasks.blogspot.com/");
		driver.switchTo().frame("navbar-iframe"); //first switch to iframe 
		driver.findElement(By.id("b-query")).sendKeys("hellooo"); //then get the element
		
		
		
		
		

	}

}
