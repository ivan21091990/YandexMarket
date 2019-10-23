package steps;

import cucumber.api.java.en.When;


public class ScenarioSteps {
    BaseSteps baseSteps = new BaseSteps();
    CatalogSteps catalogSteps = new CatalogSteps();
    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();

    @When("^выбран пункт меню - 'Маркет' ")
    public void stepSelectMarket(){
        mainSteps.stepSelectMarket();
    }

    @When("^выбран пункт меню \"(.*)\"$")
    public void stepSelectMenuItems(String itemName){
        marketSteps.stepSelectMenuItems(itemName);
    }

    @When("^выбран пункт меню электроники -  \"(.*)\"$")
    public void stepSelectMenuElectronics(String itemName){
        marketSteps.stepSelectMenuElectronics(itemName);
    }

    @When("^выбраны производители телевизоров - \"(.*)\", \"(.*)\"$")
    public void stepSelectMenuProductTV(String manufacturer){
        catalogSteps.stepSelectMenuProductTV(manufacturer);
    }

    @When("^установлена стоимость телевизоров - от \"(.*)\"$")
    public void stepSetPrice(int price){
        catalogSteps.stepSetPrice(price);
    }

    @When("^выбрано количество отображаемых элементов на странице - \"(.*)\"$")
    public void stepsSelectShowBtn(int value){
        catalogSteps.stepsSelectShowBtn(value);
    }

    @When("^выполнена проверка на количество отображаемых элементов на странице - \"(.*)\"$")
    public void stepCheckShow(String expectedValue){
        catalogSteps.stepCheckShow(expectedValue);
    }

    @When("^копируем первый по списку элемент на странице и вствляем в строку поиска ")
    public void stepInputTitleElement(){
        catalogSteps.stepInputTitleElement();
    }

    @When("^нажимаем на кнопку - Найти ")
    public void stepSearchBtn(){
        catalogSteps.stepSearchBtn();
    }

    @When("^выполняем проверку соответствия наименования отображенного товара скопированному значению ")
    public void stepCheckElement(){
        catalogSteps.stepCheckElement();
    }
}
