package test_abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class test_Objects {
	
	public static WebElement element = null;
	public static WebDriver driver;
	
	public static WebElement boardPoint(WebDriver driver) { 
		element =driver.findElement(By.xpath("//*[@id=\"from\"]"));
		return element;
	}
	
	public static WebElement offPoint(WebDriver driver) { 
		element =driver.findElement(By.xpath("//*[@id=\"to\"]"));
		return element;
	}
	
	public static WebElement departureDate(WebDriver driver) { 
		element =driver.findElement(By.xpath("//*[@id=\"flightPanel\"]/div[2]/div/div[1]/div[2]"));
		return element;
	}
	
	public static WebElement arrivalDate(WebDriver driver) { 
		element =driver.findElement(By.xpath("//*[@id=\"flightPanel\"]/div[2]/div/div[1]/div[3]"));
		return element;
	}

	public static WebElement paxMix(WebDriver driver) { 
		element =driver.findElement(By.xpath("//*[@id=\"sb-Flight-pax-mix\"]"));
		return element;
	}
	
	public static WebElement travelClass(WebDriver driver) { 
		element =driver.findElement(By.xpath("//*[@id=\"flightPanel\"]/div[2]/div/div[1]/div[4]/div[1]/div[2]"));
		return element;
	}
	
	public static WebElement searchBtn(WebDriver driver) { 
		element =driver.findElement(By.xpath("//*[@id=\"flightPanel\"]/div[2]/div/div[1]/div[5]/button"));
		return element;
	}

	public static WebElement adultCount(WebDriver driver) { 
		element =driver.findElement(By.xpath("//*[@id=\"AdultKey0\"]/div[1]/span"));
		return element;
	}
	public static WebElement youngAdultCount(WebDriver driver) { 
		element =driver.findElement(By.xpath("//*[@id=\"YoungAdultKey0\"]/div[1]/span"));
		return element;
	}
	public static WebElement childCount(WebDriver driver) { 
		element =driver.findElement(By.xpath("//*[@id=\"ChildKey0\"]/div[1]/span"));
		return element;
	}
	public static WebElement infantCount(WebDriver driver) { 
		element =driver.findElement(By.xpath("//*[@id=\"InfantKey0\"]/div[1]/span"));
		return element;
	}
	
	public static WebElement a_increase(WebDriver driver){
		element =driver.findElement(By.xpath("//*[@id=\"AdultKey0\"]/div[3]/div/button[2]"));
		return element;
	}	
	public static WebElement a_decrease(WebDriver driver){
		element =driver.findElement(By.xpath("//*[@id=\"AdultKey0\"]/div[3]/div/button[1]"));
		return element;
	}
	public static WebElement ya_increase(WebDriver driver){
		element =driver.findElement(By.xpath("//*[@id=\"YoungAdultKey0\"]/div[3]/div/button[2]"));
		return element;
	}
	public static WebElement ya_decrease(WebDriver driver){
		element =driver.findElement(By.xpath("//*[@id=\"YoungAdultKey0\"]/div[3]/div/button[1]"));
		return element;
	}
	public static WebElement c_increase(WebDriver driver){
		element =driver.findElement(By.xpath("//*[@id=\"ChildKey0\"]/div[3]/div/button[2]"));
		return element;
	}
	public static WebElement c_decrease(WebDriver driver){
		element =driver.findElement(By.xpath("//*[@id=\"ChildKey0\"]/div[3]/div/button[1]"));
		return element;
	}
	public static WebElement i_increase(WebDriver driver){
		element =driver.findElement(By.xpath("//*[@id=\"InfantKey0\"]/div[3]/div/button[2]"));
		return element;
	}
	public static WebElement i_decrease(WebDriver driver){
		element =driver.findElement(By.xpath("//*[@id=\"InfantKey0\"]/div[3]/div/button[1]"));
		return element;
	}

	public static WebElement paxmixConfirm(WebDriver driver){
		element =driver.findElement(By.xpath("//*[@id=\"sb-Flight-pax-mix-pop-up\"]/button"));
		return element;
	}
	
	public static WebElement yearMatch(WebDriver driver){
		element =driver.findElement(By.xpath("//*[@id=\"datepicker-pop-up-modal ba-datepicker\"]/div/div[2]/div[1]/div/div[2]/span[1]/text()"));
		return element;
	}
	
	public static WebElement datePicker(WebDriver driver){
		element =driver.findElement(By.className("ui-datepicker-calendar"));
		return element;
	}
	
//	WebElement datePicker = Wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar"))).get(0);
}
