package Objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {
	@FindBy(xpath="//span[@class='dvHeaderText]")private WebElement orgHeadtxt;
	public  OrganizationInformationPage(WebDriver driver){
	PageFactory.initElements(driver, this);	

}
public WebElement getOrgText() {
	return orgHeadtxt;
}
//Business Library
public String getTestoforg() {
	return orgHeadtxt.getText();
}
}