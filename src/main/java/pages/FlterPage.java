package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class FlterPage extends BasePage {

    @FindBy(xpath = "//*[@name = 'glf-pricefrom-var']")
    WebElement inputPrice;

    @FindBy(xpath = "//a[@role= 'button' and contains(@class, 'action_show-filtered')]")
    WebElement suitable;

    @FindBy(xpath = "//div[@data-filter-id='7893318']//div[contains(@class, 'list-items')]")
    WebElement searchMenu;

    public FlterPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void clickSuitable(){
        suitable.click();
    }

    public void selectMenuProduct(String manufacturer) {
        searchMenu.findElement(By.xpath("//*[text() = '" + manufacturer + "']")).click();
    }

    public void setPrice(String price) {
        inputPrice.sendKeys(price);
    }
}
