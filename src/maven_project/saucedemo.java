package first.maven_project;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class saucedemo {

	public void checkout() throws InterruptedException {
		System.setProperty("WebDriver.firefox.driver", "C:\\Users\\hiba.ahmed\\Downloads\\geckodriver-v0.33.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");	
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
		
		//Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); -- implicit wait
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));w.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn"))).click(); 
		
		//WebElement open_menu = driver.findElement(By.id("react-burger-menu-btn"));
		//open_menu.click();
		
		WebElement menu_item = driver.findElement(By.id("inventory_sidebar_link"));
		menu_item.click();
		
		Thread.sleep(1000);
		
		WebElement close_menu = driver.findElement(By.id("react-burger-cross-btn"));
		close_menu.click();
		
		//get product with "absolute path"
		//WebElement product = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]"));
		//product.click();
		
		//get product with "relative path"
		WebElement product = driver.findElement(By.xpath("//a[@id='item_1_img_link']"));
		product.click();
		
		//get cart with "CSS selector"
		WebElement cart = driver.findElement(By.cssSelector("button[id='add-to-cart-sauce-labs-bolt-t-shirt']"));
		cart.click();
		
		//navigate to 'shopping cart' with 'xpath'
		WebElement shopping_cart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
		shopping_cart.click();
		
		//Click Checkout with 'xpath'
		WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		checkout.click();
		
		Thread.sleep(2000);
		
		//Checkout Form 
		WebElement first_name = driver.findElement(By.id("first-name"));
		first_name.sendKeys("Hiba");
		WebElement last_name = driver.findElement(By.id("last-name"));
		last_name.sendKeys("Ahmed");
		WebElement postal_code = driver.findElement(By.id("postal-code"));
		postal_code.sendKeys("42893");
		WebElement continuee = driver.findElement(By.id("continue"));
		continuee.click();
		
		Thread.sleep(2000);
		
		//Finish Checkout
		WebElement finish = driver.findElement(By.xpath("//button[@id='finish']"));
		finish.click();
		
		Thread.sleep(2000);
		
		//Back to Home
		WebElement back_to_home = driver.findElement(By.xpath("//button[@id='back-to-products']"));
		back_to_home.click();
		
		driver.close();
		}
	
}
