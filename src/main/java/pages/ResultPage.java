package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage {

    @FindBy(xpath = "//h1[contains(@class,'title')]")
    WebElement title;

    public void checkTitle(){
        Assert.assertEquals(element, title.getText());
    }
}
