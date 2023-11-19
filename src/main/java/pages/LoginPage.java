package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By usernameField = By.id("Email");
    By passwordField = By.id("inputPassword");
    By loginButton = By.id("btnLogin");
    By unsuccessfulLoginError = By.id("vldLoginSummary");
    public void enterValidUsernameField(String username){
        setElementText(usernameField,username);
    }
    public void enterPasswordField(String password){

        setElementText(passwordField,password);
    }
    public void enterInValidEUsernameField(String username){
        setElementText(usernameField,username);
    }
    public void clickOnLogin(){
        clickOnElement(loginButton);
    }
    public boolean isErrorMessageDisplayed(){
        return isElementDisplayed(unsuccessfulLoginError);
    }
    public String getErrorMessage(){
        return getElementText(unsuccessfulLoginError);
    }
    public void navigateHomePage() {
        navigateToHomePage();
    }

}
