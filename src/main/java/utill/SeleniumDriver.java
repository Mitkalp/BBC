package utill;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
	
private static SeleniumDriver seldriver=null;
private static WebDriver driver=setupSeleniumDriver();
private static WebDriverWait wait=null;
public final static int Time_Out=30;
public final static int PAge_Load_time=50;
	
	private SeleniumDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.manage().window().maximize();

        wait=new WebDriverWait(driver,Time_Out);	
    
        driver.manage().timeouts().implicitlyWait(PAge_Load_time, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAge_Load_time, TimeUnit.SECONDS);
	}
	
	
	public static void openPage(String url) {
		driver.get(url);
		
	}


	public static WebDriver getDriver() {
		return driver;
		
	}
	
	public static WebDriver setupSeleniumDriver() {
		if(seldriver == null) {
			seldriver=new SeleniumDriver();
		}
		return driver;
	}
	

	public static void tearDown() {
		
		if (driver != null) {
			driver.close();
			driver.quit();
			
		}
		seldriver=null;
	}
}
