package utilities;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;

import org.apache.commons.io.FileUtils;


public class takeScreenshot {
	static int a =1;
public static void screenShotTC(WebDriver ldriver)throws Exception{
		
		File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
		
		try
			{ // now copy the screenshot to desired location using copyFile method
			FileUtils.copyFile(src, new File("C:\\Users\\n506072\\eclipse-workspace\\test_abc\\Screenshots\\"+a+"  "+System.currentTimeMillis()+".png"));
			a++;
			}catch (Exception e){
			
				System.out.println("Error in taking Screenshot!!");
				System.out.println(e.getMessage());
			
			}
		}

}
