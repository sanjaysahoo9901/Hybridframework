package Objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="")private WebElement orglnk;
@FindBy(xpath="")private WebElement oppolnk;
@FindBy(xpath="")private WebElement admimg;
@FindBy(xpath="")private WebElement signoutlnk;

//constructor
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//getters

public WebElement getOrglnk() {
	return orglnk;
}

public WebElement getOppolnk() {
	return oppolnk;
}

public WebElement getAdmimg() {
	return admimg;
}

public WebElement getSignoutlnk() {
	return signoutlnk;
}
//Business Library
public void clickonOrgLnk() {
	orglnk.click();
}
public void clickOnOpprtunitiesLnk() {
	oppolnk.click();
}
public void logOutApp(WebDriver driver) {
	mouseoverToElement(driver,admimg);
	signoutlnk.click();
}

}




