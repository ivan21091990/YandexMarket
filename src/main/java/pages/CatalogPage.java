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

    @FindBy(xpath = "//button[contains(@class,'button_arrow_down button_size_s')]")
    WebElement show;

    @FindBy(xpath = "//select[@class='select__control']")
    WebElement showMenu;

    @FindBy(xpath = "//*[contains(@class,'n-snippet-card2__title')]")
    List <WebElement> elementList;

    @FindBy(xpath = "//*[@id='header-search']")
    WebElement stringSearch;

    @FindBy(xpath = "//div[@class = 'suggest2-rich-item__body']")
    List <WebElement> productList;

    @FindBy(xpath = "//*[contains(@class,'radio_side_right')]")
    WebElement list;

    @FindBy(xpath = "//*[text()='Все фильтры']")
    WebElement filter;

    public CatalogPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectFilter(){
        filter.click();
    }

    public void selectList(){
        list.click();
    }

    public void selectShowBtn(int count) throws InterruptedException {
        Thread.sleep(5000);
        show.click();
        showMenu.findElement(By.xpath("//*[@class = 'popup__content']//*[contains(text(), 'Показывать по " + count + "')]")).click();
    }

    public void checkShow(int expectedValue) throws InterruptedException {
        Thread.sleep(5000);
        int actualValue=elementList.size();
        Assert.assertEquals(expectedValue, actualValue);
    }

    public void inputTitleElement(){
        element = elementList.get(0).getText();
        String value = element.replace("Телевизор ","")
                .replace("Samsung ", "")
                .replace("LG ", "")
                .replace("Наушники ", "");
        stringSearch.sendKeys(value);
        productList.get(0).click();
    }
}


