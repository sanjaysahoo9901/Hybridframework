package Objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	//Declaration
	@FindBy(xpath="")private WebElement untxt;
	@FindBy(xpath="")private WebElement pwdtxt;
	@FindBy(xpath="")private WebElement loginBtn;
		
//intialization
	public loginpage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization(getters)

	public WebElement getUntxt() {
		return untxt;
	}

	public WebElement getPwdtxt() {
		return pwdtxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	//Busness Libary(Action Method)
	public void loginToApp(String un,String pwd) {
		untxt.sendKeys(un);
		pwdtxt.sendKeys(pwd);
		loginBtn.click();
	}
}


