package Objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement orglookupImg;
	public Organization(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	public WebElement orglookupImg() {
		return orglookupImg;
	}
	//Business Library
	public void clickOnorglookupImg() {
		orglookupImg.click();
	}
	}


