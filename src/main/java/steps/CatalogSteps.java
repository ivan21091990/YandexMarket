package steps;

import pages.CatalogPage;
import pages.FlterPage;
import ru.yandex.qatools.allure.annotations.Step;

public class CatalogSteps {

   @Step("Нажата кнопка - 'Все фильтры'")
   public void stepSelectFilter(){
       new CatalogPage().selectFilter();
   }

    @Step("Выбрано представление элементов на странице списком")
    public void stepSelectList(){
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.selectList();
    }
    @Step("Выбрано количество отображаемых элементов на странице - {0}")
    public void stepsSelectShowBtn(int count) throws InterruptedException {
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
