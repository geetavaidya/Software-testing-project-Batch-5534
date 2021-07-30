package basics;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dominos 
{

	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumwebdriver\\Chrome Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().window().maximize();

// Open Domino's website	
		driver.get("https://pizzaonline.dominos.co.in/menu?categoryId=3");
		System.out.println(" Open Domino's website");
		
// Scroll Down	
		JavascriptExecutor js =(JavascriptExecutor)driver;		
		js.executeScript("window.scrollBy(0,550)");		//scroll down(+ve)
		//Thread.sleep(3000);
		System.out.println("scrolled Down");

//	 Nonveg pizza window

	 driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]")).click();
	 //js.executeScript("window.scrollBy(0,550)");		//scroll down(+ve)
	 System.out.println("Nonveg Pizza menu window is display");
	
 //  Nonveg pizza menu window

	 driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
	// js.executeScript("window.scrollBy(0,550)");		//scroll down(+ve)
	 System.out.println("Chicken Golden Delight pizza is display");


 // Select Size
	 
	  driver.findElement(By.xpath("//span[contains(text(),'Serves 2')]")).click();
	  js.executeScript("window.scrollBy(0,550)");		//scroll down(+ve)
	  System.out.println("Select Size menu is display");

// Select Crust	
	  
	   driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/span[1]")).click();
	   js.executeScript("window.scrollBy(0,1200)");		//scroll down(+ve)
	   System.out.println("Select Crust menu is display");
	 
// Extra Cheese

   		WebElement add_cheese=driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]"));
   		js.executeScript("arguments[0].click()",add_cheese);
   		System.out.println("Extra cheese added on topping");

   		WebElement add_mashroom = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[3]/div[3]/div[2]/div[2]/div/div/div/div[2]/ul/li[1]/div/div[2]"));
   		js.executeScript("arguments[0].click()",add_mashroom);
   		System.out.println("mashroom added");

   		WebElement add_onion = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[3]/div[3]/div[2]/div[2]/div/div/div/div[2]/ul/li[2]"));
   		add_onion.click();
   		System.out.println("onion added");

   		WebElement add_cpsicm = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[3]/div[3]/div[2]/div[2]/div/div/div/div[2]/ul/li[3]"));
   		add_cpsicm.click();
   		System.out.println("capcicm added");

// Add Veg Topping
	   
	   driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/img[1]")).click();
	   js.executeScript("window.scrollBy(0,1300)");		//scroll down(+ve)
	   System.out.println("Add Veg Toppings menu is display");

// Add Non-Veg Toppings
	 
	    driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/img[1]")).click();
	   js.executeScript("window.scrollBy(0,1350)");		//scroll down(+ve)
	   System.out.println("Pepper Barbecue Chicken is selected");
	   
	   driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/img[1]")).click();
	   System.out.println("PeriPeriChicken is selected");
	   
	   driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/img[1]")).click();
	   System.out.println("Grilled Chicken Rasher is selected");


//	ADD TO CART	   
	   driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/button[1]/span[1]")).click();
	   System.out.println("added to cart");
	  
// increase quantity
	   
	   driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")).click();
	   System.out.println("Quantity Increased ");
	
// checkout button
	   
	   driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
	   System.out.println("checkout");

//add location
	   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[2]/div/div[1]/div/div[1]/div[2]/div")).click();;
	   System.out.println("clicked on add location");

// address feild
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/div[1]/input")).sendKeys("Nashik");
		
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div/div[1]/div[2]/div[2]/div/ul/li[1]/div[2]/span[1]")).click();
	   		
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/div[2]/div/input")).sendKeys("Jail Road");
	   		
	   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div/div[1]/div[2]/div[2]/div/ul/li[4]/div[2]")).click();
	   System.out.println("address selected");
	   
//place order
	   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[2]/div/div[6]/div/div/div[7]/button/span")).click();
	   System.out.println("order placed");


	    driver.close();
	}

	
}
