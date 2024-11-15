package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	public void maximizewindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void minimizewindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	public void handleDD(String value,WebElement element) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void handleDD(WebElement element,String visibleText) {
		Select s=new Select(element);
		s.selectByVisibleText(visibleText);
		
	}
	public void mouseoverToElement(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	public void rightClickPage(WebDriver driver) {
		Actions a=new Actions(driver);
		a.contextClick();
	}
	
}
