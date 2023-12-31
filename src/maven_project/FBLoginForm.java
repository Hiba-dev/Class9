package first.maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FBLoginForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize gecko driver
        System.setProperty("webriver.gecko.driver","C:\\Users\\hiba.ahmed\\Downloads\\geckodriver-v0.33.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//intialize edge driver
		/*System.setProperty("webdriver.edge.driver","C:\\Users\\hiba.ahmed\\Downloads\\msedgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();*/
		
		//Facebook Login
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("qateam768@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("G9Tech#QA");
		WebElement button = driver.findElement(By.id("loginbutton"));
		button.click();
		driver.quit();
	    driver.close();

	}

}
