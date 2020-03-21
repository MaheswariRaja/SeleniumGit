package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercurytour {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium_mahesh\\workspace\\seleniumDecBatch\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		 to  maximize the window
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
//		 navigate to  a particular site
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("REGISTER")).click();
//		 to go back
		driver.navigate().back();
		Thread.sleep(3000);
//		 to come forward
		driver.navigate().forward();
		Thread.sleep(3000);
//		 to refresh
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("acte");
		driver.findElement(By.id("userName")).sendKeys("acte@gmail.com");
		driver.findElement(By.id("email")).sendKeys("actedec");
		driver.findElement(By.name("password")).sendKeys("dec2019");
		driver.findElement(By.name("confirmPassword")).sendKeys("dec2019");
		driver.findElement(By.name("register")).submit();
//		driver.close();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
