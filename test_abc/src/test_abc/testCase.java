package test_abc;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.dataInput_Output;
import utilities.driver_Setup;

public class testCase {

	public static WebDriver driver;
	public static String[][] a;
//	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		
		a = dataInput_Output.readexcel();
		driver=driver_Setup.driverInstantiate("chrome");
				System.out.println("The Value is: ");
	            System.out.println(a[0][2]);  
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     test_Objects.boardPoint(driver).sendKeys(a[0][0]);
	     test_Objects.boardPoint(driver).sendKeys(Keys.TAB);
	     Thread.sleep(1000);
	     test_Objects.offPoint(driver).sendKeys(a[0][1]);
	     test_Objects.offPoint(driver).sendKeys(Keys.TAB);
	     Thread.sleep(1000);
	     test_Objects.departureDate(driver).click();
	     
	     try {
	     	 String d;
			String m;
			String y;
	    	 d= a[0][2].substring(0,2);
	//    	 d = (a[0][2].substring(0,2));
	    	 m = (a[0][2].substring(3,6));
	    	 y = (a[0][2].substring(6));
	    	 System.out.println(d +" "+ m +" "+ y);
	  //  	 if(Integer.parseInt(test_Objects.yearMatch(driver).getText()) != y) {
	  //  		 y = Integer.parseInt(test_Objects.yearMatch(driver).getText());
	  //  	 }
	    	 List<WebElement> columns = test_Objects.datePicker(driver).findElements(By.tagName("td"));
	    	 columns.stream().filter(element -> element.getText().contains(d)).findFirst().ifPresent(WebElement::click);
	    	 
	     	}catch(Exception e){
				e.printStackTrace();
	     	}
	     Thread.sleep(5000);
	     driver_Setup.driverClose();
	   
	
	}

}