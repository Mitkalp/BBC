package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BBCSearchPF {

    @FindBy (xpath = "//input[@id=\"orb-search-q\"]")
   public WebElement searchTextBox;

    @FindBy(xpath = "//*[@type='submit']")
    public  WebElement searchBox;

    @FindBy(xpath = "//main[@id='main-content']/div/div[3]/div/div/ul/li")
    public List<WebElement> allLinks ;

}
