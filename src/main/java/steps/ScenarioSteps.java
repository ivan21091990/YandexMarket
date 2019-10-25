package steps;

import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.CatalogPage;


public class ScenarioSteps {

    CatalogSteps catalogSteps = new CatalogSteps();
    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    ResultSteps resultSteps = new ResultSteps();

    @When("^выбран пункт меню - 'Маркет'")
    public void stepSelectMarket(){
        mainSteps.stepSelectMarket();
    }

    @When("^выбран пункт меню \"(.*)\"$")
    public void stepSelectMenuItems(String itemName){
        marketSteps.stepSelectMenuItems(itemName);
    }

    @When("^выбран пункт меню электроники - \"(.*)\"$")
    public void stepSelectMenuElectronics(String itemName){
        marketSteps.stepSelectMenuElectronics(itemName);
    }

    @When("^выбрано представление элементов на странице списком")
    public void stepSelectList(){
        catalogSteps.stepSelectList();
    }

    @When("^выбраны производители телевизоров - \"(.*)\", \"(.*)\"$")
    public void stepSelectMenuProductTV(String manufacture, String product){
        catalogSteps.stepSelectMenuProductTV(manufacture,product);
    }

    @When("^выбран производитель наушников - \"(.*)\"$")
    public void stepSelectMenuProduct(String manufacture){
        catalogSteps.stepSelectMenuProduct(manufacture);
    }

    @When("^установлена стоимость телевизоров - от \"(.*)\"$")
    public void stepSetPrice(int price){
        catalogSteps.stepSetPrice(price);
    }

    @When("^выбрано количество отображаемых элементов на странице - \"(.*)\"$")
    public void stepsSelectShowBtn(int count){
        catalogSteps.stepsSelectShowBtn(count);
    }

    @When("^выполнена проверка на количество отображаемых элементов на странице - \"(.*)\"$")
    public void stepCheckShow(int expectedValue) throws InterruptedException {
        catalogSteps.stepCheckShow(expectedValue);
    }

    @When("^копируем первый по списку элемент на странице и вствляем в строку поиска")
    public void stepInputTitleElement(){
        catalogSteps.stepInputTitleElement();
    }

    @When("^выполняем проверку соответствия наименования отображенного товара скопированному значению")
    public void stepCheckElement(){
        resultSteps.stepCheckTitle();
    }
}
