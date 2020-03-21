package learn;

//import java.awt.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\learn\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		 to  maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement accountlist = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		action.moveToElement(accountlist).build().perform();
		String stringcheck = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//a//span[@class='nav-action-inner']")).getText();
		System.out.println(stringcheck);
		driver.close();
		
	}

}
