package learn;

//import java.awt.List;
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\learn\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		 to  maximize the window
		driver.manage().window().maximize();
		//driver.get("https://www.spicejet.com/");
		//WebElement fromsta = driver.findElement(By.name("ctl00$mainContent$ddl_originStation1"));
		//WebElement fromsta = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		//Select s = new Select(fromsta);
		//s.selectByValue("MAA");
		//WebElement fromsta = driver.findElement(By.xpath("//select[@name='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		//Select s = new Select(fromsta);
		//s.selectByValue("DEL");
		//WebElement fromsta = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$view_date1']"));
		//Select s = new Select(fromsta);
		//fromsta.sendKeys("Chennai (MAA)");
		//Thread.sleep(3000);
		//ctl00_mainContent_ddl_destinationStation1_CTXT
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Delhi (DEL)");
		//Thread.sleep(1000);
		//WebElement date = driver.findElement(By.xpath("//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[5]/td[6]/a"));
		
		
		//driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		//ctl00_mainContent_view_date1
        //WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
        //date.sendKeys("31/01");
		
		//driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		//driver.findElement(By.xpath("//a[text()='31']")).click();
	//	driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
		//driver.close();
		/*driver.get("http://www.spicejet.com/");

	    driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();

	    //Select origin
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("DEL");

	    driver.findElement(By.linkText("Delhi (DEL)")).click();

	    //Select destination
	    driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("BOM");

	    driver.findElement(By.linkText("Mumbai (BOM)")).click();

	    WebElement DateWidget = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[2]/td[4]"));
	    java.util.List<WebElement> columns = DateWidget.findElements(By.tagName("td"));

	    for (WebElement cell: columns)
	    {
	        if (cell.getText().equals("5"))
	        {
	            cell.findElement(By.linkText("5")).click();
	            break;
	        }
	    }

	    Select AdultDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));

	    AdultDropdown.selectByValue("2");


	    Select ChildrenDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));

	    ChildrenDropdown.selectByValue("1");


	    Select InfantDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));

	    InfantDropdown.selectByValue("1");


	    Select CurrencyDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

	    CurrencyDropdown.selectByValue("INR");


	    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
//		
 
 */
		

	}

}
