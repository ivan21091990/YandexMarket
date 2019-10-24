package steps;

import pages.CatalogPage;
import ru.yandex.qatools.allure.annotations.Step;

public class CatalogSteps {

    @Step("Выбраны производители телевизоров - {0},{1}")
    public void stepSelectMenuProductTV(String manufacture, String product){
       CatalogPage catalogPage = new CatalogPage();
        catalogPage.waitShowBtnClickable();
        catalogPage.selectMenuProductTV(manufacture);
        catalogPage.selectMenuProductTV(product);
    }

    @Step("Установлена стоимость телевизоров - от {0}")
    public void stepSetPrice(int price){
        new CatalogPage().setPrice(Integer.toString(price));
    }

    @Step("Выбрано количество отображаемых элементов на странице - 12")
    public void stepsSelectShowBtn(){
        new CatalogPage().selectShowBtn();
    }

    @Step("Выполнена проверка на количество отображаемых элементов на странице - {0}")
    public void stepCheckShow(String expectedValue){
        new CatalogPage().checkShow(expectedValue);
    }

    @Step("Копируем первый по списку элемент на странице и вствляем в строку поиска")
    public void stepInputTitleElement(){
        new CatalogPage().inputTitleElement();
    }

    @Step("Нажимаем на кнопку - Найти")
    public void stepSearchBtn(){
        new CatalogPage().searchBtn();
    }

    @Step("Выполняем проверку соответствия наименования отображенного товара скопированному значению")
    public void stepCheckElement(){
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.waitShowBtnClickable();
        new CatalogPage().checkElement();
    }

}
