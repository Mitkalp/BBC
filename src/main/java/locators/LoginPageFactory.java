package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPageFactory {
 @FindBy (xpath = "//span[text()=\"Sign in\"]")
    public WebElement homePageSignInLink;


 @FindBy(xpath = "//h1[@class=\"heading u-padding-bottom-quad u-padding-top-hex--tablet\"]")
  public   WebElement headerSignInLogo;

 @FindBy(xpath = "//div[@data-bbc-title=\"password-error\"]")
 public WebElement passwordBlankErrorText;

 @FindBy(xpath = "//div[@data-bbc-title=\"username-error\"]")
 public WebElement usernameBlankErrorText;

 @FindBy(xpath = "//div[@data-bbc-title=\"general-error\"]")
 public WebElement usernameGeneralErrorText;

@FindBy(xpath = "//input[@type=\"email\"]")
  public   WebElement userNameTextField;

@FindBy(xpath = "//input[@type=\"password\"]")
  public   WebElement passwordTextField;

@FindBy(xpath = "//*[@type=\"submit\"]")
  public   WebElement signInButton;

@FindBy(xpath = "//span[text()=\"Need help signing in?\"]")
   public WebElement needHelpSignInLink;

@FindBy(xpath = "//span[text()=\"Don’t have a BBC account?\"]")
  public   WebElement noBBCAccountText;

@FindBy(xpath = "//span[text()=\"Register now\"]")
  public   WebElement registerNowLink;

}

