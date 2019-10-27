package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSteps {

    @Step("выбран пункт меню {0}")
    public void stepSelectMenuItems(String itemName){
        new MarketPage().selectMenuItems(itemName);
    }

    @Step("выбран пункт меню {0}")
    public void stepSelectMenuElectronics(String itemName){
        new MarketPage().selectMenuElectronics(itemName);
    }
}
