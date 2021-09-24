package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver_Setup {
	
	public static WebDriver driver;

	public static String exePath;
	public static String url = "https://ecp-prelive.baplc.com/travel/home/public/en_gb/";
	public static String browsertype;

	
	public static WebDriver driverInstantiate(String browser){
	
		browsertype= browser;
	
		if(browsertype.equalsIgnoreCase("chrome")) {
			exePath = "C:\\Users\\n506072\\Desktop\\Impt\\BA_prelive_Automate\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().deleteAllCookies();
		return driver;
	}
	
	public static void driverClose(){
	driver.close();
	}

}
