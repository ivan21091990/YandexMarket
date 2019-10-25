package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class ResultPage extends BasePage {

    @FindBy(xpath = "//h1[contains(@class,'title')]")
    WebElement title;

    public void checkTitle(){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(title));
        Assert.assertEquals(element, title.getText());
    }
}
