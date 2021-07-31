package Pages_actions;

import locators.BBCSearchPF;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utill.SeleniumDriver;

public class SearchPageAction {

    public  static WebDriver driver =null;
    BBCSearchPF search= null;


    public SearchPageAction() {
        this.search = new BBCSearchPF();
        PageFactory.initElements(SeleniumDriver.getDriver(), search);
    }

    public String getPageTitle() {
        return SeleniumDriver.getDriver().getTitle();
    }

    public void search(){
        if (search.searchTextBox.isDisplayed() && search.searchTextBox.isEnabled()) {
            search.searchTextBox.click();
            search.searchTextBox.sendKeys("sports");
           search.searchBox.submit();

        }

    }

    public void  getAllLinks(){

        int size=search.allLinks.size();
        System.out.println(size);
        String[] text1 = new String[10];
        int i =0;
        String linksText;
        for(WebElement a1 : search.allLinks){
            linksText = a1.findElement(By.tagName("a")).getText();
           // System.out.println(linksText);
            text1[i] = linksText;
            i++;
        }
        System.out.println("First Heading"+text1[0]);
        System.out.println("Last Heading"+text1[9]);


    }




}

