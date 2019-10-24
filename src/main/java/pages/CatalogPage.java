package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class CatalogPage extends BasePage {
    String element = null;

    @FindBy(xpath = "//div[contains(@class,'_178jz2CyDL')]")
    WebElement searchMenu;

    @FindBy(xpath = "//*[contains(@id,'glpricefrom')]")
    WebElement inputPrice;

    @FindBy(xpath = "//select[@tabindex= '-1' and @autocomplete='off']")
    public WebElement showMenu;

    @FindBy(xpath = "//*[@id='product-1816088052']/div[4]/div[1]/div[1]/a")
    WebElement firstElement;

    @FindBy(xpath = "//*[@id='header-search']")
    WebElement stringSearch;

    @FindBy(xpath = "//*[@type = 'submit']")
    WebElement search;

    public CatalogPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuProductTV(String manufacturer) {
        searchMenu.findElement(By.xpath("//input[@type='checkbox'][contains(@name,'Производитель " + manufacturer + "')]/..")).click();
    }

    public void selectMenuProduct(String manufacturer) {
        searchMenu.findElement(By.xpath("//input[@type='checkbox'][contains(@name,'Производитель " + manufacturer + "')]/..")).click();
    }

    public void setPrice(String price) {
        inputPrice.sendKeys(price);
    }

    public void waitShowBtnClickable() {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(
                BaseSteps.getDriver().findElement(By.xpath("//button[contains(@class, ' i-bem button_js_inited')]"))));
    }

    public void selectShowBtn(){
        Select select = new Select(showMenu);
        select.selectByIndex(0);
    }

    public void checkShow(String expectedValue) {
        String xpath = "//span[contains(text(), 'Показывать по ')][@class='button__text']";
        String actualValue = BaseSteps.getDriver().findElement(By.xpath(xpath)).getText();
        Assert.assertEquals(expectedValue, actualValue);
    }

    public String  copyElement(){
        String element = firstElement.getText();
        return element;
    }

    public void inputTitleElement(){
        element = copyElement();
        stringSearch.sendKeys(element);
    }

    public void searchBtn(){
        search.click();
    }

    public void checkElement() {
        String actualValue = copyElement();
        Assert.assertEquals(element, actualValue);
    }
}


