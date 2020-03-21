package learn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\learn\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).sendKeys("MAA, Madras,Chennai International Airport India");
		//driver.findElement(By.id("toCity")).sendKeys("BOM, Chhatrapati Shivaji International Airport India");
		//driver.findElement(By.linkText("BOM, Chhatrapati Shivaji International Airport India")).click();
		//driver.findElement(By.xpath(xpathExpression))
		//Thread.sleep(2000);
		WebElement fromcity= driver.findElement(By.id("fromCity"));
		//WebElement findElement = driver.findElement(By.id("fromCity"));
		fromcity.click();
		fromcity.sendKeys("mum");
		fromcity.sendKeys(Keys.ARROW_DOWN);
		fromcity.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		

	}

}
