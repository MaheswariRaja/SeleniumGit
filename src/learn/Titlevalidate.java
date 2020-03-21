package learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlevalidate {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
					"D:\\selenium\\learn\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
//			 to  maximize the window
			driver.manage().window().maximize();
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
//			
		String expectedTitle = "Welcome: Mercury Tours";
		
		String ActualTitle = driver.getTitle();
		if(expectedTitle.equals(ActualTitle)){
			System.out.println("test case passed");
			if(ActualTitle.contains("sdgvsdf")){
				System.out.println(ActualTitle);
			}else{
				System.out.println("text is not present");
			}
		}else{
			System.out.println("Test case failed");
		}
		driver.close();
		

	}

}
