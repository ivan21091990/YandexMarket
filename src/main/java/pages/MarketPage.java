package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MarketPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'n-w-tabs__horizontal-tabs-container')] ")
    WebElement menuItems;

    @FindBy(xpath = " //div[contains(@class, 'section N9o4gAuSnb QGJ9xgri-V ')]" )
    WebElement menuElectronics;

    public MarketPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItems(String itemName){
        menuItems.findElement(By.xpath("//*[text()= '"+itemName+"']")).click();
    }

    public void selectMenuElectronics(String itemName){
        menuElectronics.findElement(By.xpath("//a[text()='"+itemName+"']")).click();
    }
}


