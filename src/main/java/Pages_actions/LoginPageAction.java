package Pages_actions;

import locators.LoginPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sun.net.util.IPAddressUtil;
import utill.SeleniumDriver;

public class LoginPageAction {
    public  static WebDriver driver =null;
    LoginPageFactory bbc = null;


    public LoginPageAction() {
        this.bbc = new LoginPageFactory();
        PageFactory.initElements(SeleniumDriver.getDriver(), bbc);
    }

    public String getPageTitle() {
        return SeleniumDriver.getDriver().getTitle();
    }



    public void  homePageSignIn(){
        if(bbc.homePageSignInLink.isDisplayed()){
            bbc.homePageSignInLink.click();
        }
    }


          public String passwordErrorText(){
              return bbc.passwordBlankErrorText.getText();
          }

          public String usernameErrorText(){
              return bbc.usernameBlankErrorText.getText();
          }
          public String usernameGeneralErrorText(){
              return bbc.usernameGeneralErrorText.getText();

          }

    public void doLogin (String userName,String password) {
        if (bbc.userNameTextField.isDisplayed() && bbc.userNameTextField.isEnabled()) {
            bbc.userNameTextField.sendKeys(userName);
        }
        if (bbc.passwordTextField.isDisplayed() && bbc.passwordTextField.isEnabled()) {
            bbc.passwordTextField.sendKeys(password);
        }

    }

    public void signInButton() {
        if (bbc.signInButton.isDisplayed() && bbc.signInButton.isEnabled()) {
            bbc.signInButton.submit();
        }

    }
    public String needHelpSignInLink(){
        if(bbc.needHelpSignInLink.isDisplayed()){
            return bbc.needHelpSignInLink.getText();
        }
        bbc.needHelpSignInLink.click();
        return null;
    }

    public String getNoBBCAccountText(){
        if(bbc.noBBCAccountText.isDisplayed()){
            return bbc.noBBCAccountText.getText();
        }
        return null;
    }
    public String registerNowLink(){
        if (bbc.registerNowLink.isDisplayed()){
            return bbc.registerNowLink.getText();
        }
        return null;
    }



}



