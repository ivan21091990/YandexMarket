package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.List;

public class CatalogPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'_178jz2CyDL')]")
    WebElement searchMenu;

    @FindBy(xpath = "//*[contains(@id,'glpricefrom')]")
    WebElement inputPrice;

    @FindBy(xpath = "//select[@tabindex= '-1' and @autocomplete='off']")
    WebElement showMenu;

    @FindBy(xpath = "//button[contains(@class,'button_arrow_down button_size_s')]")
    WebElement show;

    @FindBy(xpath = "//div[contains(@class,'n-snippet-')][contains(@id,'product-')]")
    List <WebElement> elementList;

    @FindBy(xpath = "//*[@id=\"product-1816088052\"]//a[contains(@class, 'blue link')]")
    WebElement firstElement;

    @FindBy(xpath = "//*[@id='header-search']")
    WebElement stringSearch;

    @FindBy(xpath = "//div[@class = 'suggest2-rich-item__body']")
    List <WebElement> productList;

    @FindBy(xpath = "//*[@value='list']")
    WebElement list;

    public CatalogPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectList(){
        list.click();
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
                BaseSteps.getDriver().findElement(By.xpath("//button[contains(@class,'button_arrow_down button_size_s')]"))));
    }

    public void selectShowBtn(int count){
        waitShowBtnClickable();
        show.click();
        showMenu.findElement(By.xpath("//*[@class = 'popup__content']//*[contains(text(), 'Показывать по " + count + "')]")).click();
    }

    public void checkShow(int expectedValue) throws InterruptedException {
        Thread.sleep(3000);
        int actualValue=elementList.size();
        Assert.assertEquals(expectedValue, actualValue);
    }

    public void inputTitleElement(){
        element = firstElement.getText();
        String value = element.replace("Телевизор ","").replace("Samsung ", "").replace("LG ", "");
        stringSearch.sendKeys(value);
        productList.get(0).click();
    }
}


