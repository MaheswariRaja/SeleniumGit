package learn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\learn\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		 to  maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/default.aspx");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Chennai (MAA)");
		//WebElement dest = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		//dest.clear();
		//dest.sendKeys("Delhi (DEL)");
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("DEL");
	    driver.findElement(By.linkText("Delhi (DEL)")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']//a")).click();
		driver.findElement(By.xpath("//td[@class='  ui-datepicker-current-day']/a")).click();
		//driver.findElement(By.id(id));
		
		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s = new Select(currency);
		s.selectByValue("USD");
		currency.click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		//driver.quit();
	}

}
