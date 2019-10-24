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

import java.util.List;

public class CatalogPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'_178jz2CyDL')]")
    WebElement searchMenu;

    @FindBy(xpath = "//*[contains(@id,'glpricefrom')]")
    WebElement inputPrice;

    @FindBy(xpath = "//select[@tabindex= '-1' and @autocomplete='off']")
    WebElement showMenu;

    @FindBy(xpath = "//button[contains(@class,'button_arrow_down')]")
    WebElement show;

    @FindBy(xpath = "//div[contains(@class,'n-snippet-')][contains(@id,'product-')]")
    List <WebElement> elementList;

    @FindBy(xpath = "//*[@id='header-search']")
    WebElement stringSearch;

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div[1]/ul/li/div/a/span")
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
                BaseSteps.getDriver().findElement(By.xpath("//button[contains(@class,'button_arrow_down')]"))));
}

    public void selectShowBtn(){
        waitShowBtnClickable();
        show.click();
        //Thread.sleep(30000);
       // new Select(showMenu).selectByValue("12");
        showMenu.findElement(By.xpath("//option[text()='Показывать по 12']")).click();
    }

    public void checkShow(int expectedValue) {
        int actualValue=elementList.size();
        Assert.assertEquals(expectedValue, actualValue);
    }

    public void inputTitleElement(){
        element = String.valueOf(elementList.get(0));
        String value = element.replace("Телевизор ","").replace("Samsung ", "").replace("LG ", "");
        stringSearch.sendKeys(value);
    }

    public void searchBtn(){
        search.click();
    }
}


