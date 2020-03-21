package learn;

//import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Stringassignamazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\learn\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 8");
		driver.findElement(By.xpath("//input[@class='nav-input' and @type='submit']")).click();
		String Title = driver.findElement(By.xpath("//*[@id=search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a")).getText();
	    System.out.println("Title is:=" +Title);
	    if (Title.contains("Renewed"))
	    	System.out.println("Title is correct");
		driver.close();
		//WebElement searchfirst = driver.findElement(By.id("twotabsearchtextbox"));
		//searchfirst.sendKeys(Keys.ARROW_DOWN);
		//searchfirst.sendKeys(Keys.ENTER);
	//	String iphonetext = driver.findElement(By.linkText("Simple Mobile Prepaid - Apple iPhone X (64GB) - Silver")).getText();
		//driver.findElement(By.linkText("Simple Mobile Prepaid - Apple iPhone X (64GB) - Silver")).click();
		
		
		
		//System.out.println(iphonetext);
		//boolean result = iphonetext.contains("iPhone X");
	
		//String price = driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/span[2]")).getText();
		
		//System.out.println("The Search result has iPhone X " + result );
		//System.out.println("The Price of the iphone is "+ price);
		driver.close();
		//driver.findElements(by.)

		//Actions a = new Actions(driver);
		//a.moveToElement(
	
	}

}
