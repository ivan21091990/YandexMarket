package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.NoSuchElementException;

import static junit.framework.TestCase.assertEquals;

public class BasePage {
    protected WebDriver driver;
    public String element = null;

    public BasePage(){
        driver = BaseSteps.getDriver();
        PageFactory.initElements(driver, this);
    }
}