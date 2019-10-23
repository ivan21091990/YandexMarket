package steps;

import pages.CatalogPage;
import ru.yandex.qatools.allure.annotations.Step;

public class CatalogSteps {

    @Step("Выбраны производители телевизоров - {0},{1}")
    public void stepSelectMenuProductTV(String manufacturer){
       CatalogPage catalogPage = new CatalogPage();
        catalogPage.waitShowBtnClickable();
        catalogPage.selectMenuProductTV("LG");
        catalogPage.selectMenuProductTV("Samsung");
    }

    @Step("Установлена стоимость телевизоров - от {0}")
    public void stepSetPrice(int price){
        new CatalogPage().setPrice(Integer.toString(price));
    }

    @Step("Выбрано количество отображаемых элементов на странице - {0}")
    public void stepsSelectShowBtn(int value){
        new CatalogPage().selectShowBtn(12);
    }

    @Step("Выполнена проверка на количество отображаемых элементов на странице - {0}")
    public void stepCheckShow(String expectedValue){
        new CatalogPage().checkShow("Показывать по 12");
    }

    @Step("Копируем первый по списку элемент на странице и вствляем в строку поиска ")
    public void stepInputTitleElement(){
        new CatalogPage().inputTitleElement();
    }

    @Step("Нажимаем на кнопку - Найти ")
    public void stepSearchBtn(){
        new CatalogPage().searchBtn();
    }

    @Step("Выполняем проверку соответствия наименования отображенного товара скопированному значению ")
    public void stepCheckElement(){
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.waitShowBtnClickable();
        new CatalogPage().checkElement();
    }

}
