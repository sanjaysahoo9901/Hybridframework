package Objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	@FindBy(xpath="//input[@name='accountname']")private WebElement orgText;
@FindBy(xpath="//input[@title='Save [Alt+S]")private WebElement saveBtn;
public CreateNewOrgPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getOrgText() {
	return orgText;
}
public WebElement getSaveBtn() {
	return saveBtn;
}
//Business Library
public void CreateNewOrgPage(String ORGNAME) {
	orgText.sendKeys(ORGNAME);
	saveBtn.click();
	
}
}
