package steps;

import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.CatalogPage;


public class ScenarioSteps {

    CatalogSteps catalogSteps = new CatalogSteps();
    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    ResultSteps resultSteps = new ResultSteps();
    FilterSteps filterSteps = new FilterSteps();

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

    @When("^нажата кнопка - 'Все фильтры'")
    public void stepSelectFilter(){
        catalogSteps.stepSelectFilter();
    }
    @When("^выбраны производители товара - \"(.*)\", \"(.*)\"$")
    public void stepSelectMenuProduct(String manufacture, String product){
        filterSteps.stepSelectMenuProduct(manufacture,product);
    }

    @When("^установлена стоимость товара - от \"(.*)\"$")
    public void stepSetPrice(int price){
        filterSteps.stepSetPrice(price);
    }

    @When("^нажата кнопка - 'Показать подходящие'")
    public void stepClickSuitable(){
        filterSteps.stepClickSuitable();
    }

    @When("^выбрано представление элементов на странице списком")
    public void stepSelectList(){
        catalogSteps.stepSelectList();
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
    public void stepInputTitleElement() throws InterruptedException {
        catalogSteps.stepInputTitleElement();
    }

    @When("^выполняем проверку соответствия наименования отображенного товара скопированному значению")
    public void stepCheckElement(){
        resultSteps.stepCheckTitle();
    }
}
