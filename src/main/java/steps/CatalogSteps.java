package steps;

import pages.CatalogPage;
import ru.yandex.qatools.allure.annotations.Step;

public class CatalogSteps {

   @Step("Выбрано представление элементов на странице списком")
   public void stepSelectList(){
       CatalogPage catalogPage = new CatalogPage();
       catalogPage.waitShowBtnClickable();
       catalogPage.selectList();
   }
    @Step("Выбраны производители телевизоров - {0},{1}")
    public void stepSelectMenuProductTV(String manufacture, String product){
       CatalogPage catalogPage = new CatalogPage();
        catalogPage.selectMenuProduct(manufacture);
        catalogPage.selectMenuProduct(product);
    }

    @Step("Выбран производитель наушников - {0}")
    public void stepSelectMenuProduct(String manufacture){
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.selectMenuProduct(manufacture);
    }

    @Step("Установлена стоимость телевизоров - от {0}")
    public void stepSetPrice(int price){
        new CatalogPage().setPrice(Integer.toString(price));
    }

    @Step("Выбрано количество отображаемых элементов на странице - {0}")
    public void stepsSelectShowBtn(int count){
        new CatalogPage().selectShowBtn(count);
    }

    @Step("Выполнена проверка на количество отображаемых элементов на странице - {0}")
    public void stepCheckShow(int expectedValue) throws InterruptedException {
        new CatalogPage().checkShow(expectedValue);
    }

    @Step("Копируем первый по списку элемент на странице и вствляем в строку поиска")
    public void stepInputTitleElement(){
        new CatalogPage().inputTitleElement();
    }
}
