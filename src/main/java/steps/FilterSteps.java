package steps;

import pages.FlterPage;
import ru.yandex.qatools.allure.annotations.Step;

public class FilterSteps {

    @Step("Выбраны производители товара - {0},{1}")
    public void stepSelectMenuProduct(String manufacture, String product){
        FlterPage filterPage = new FlterPage();
        filterPage.selectMenuProduct(manufacture);
        filterPage.selectMenuProduct(product);
    }

    @Step("Установлена стоимость товара - от {0}")
    public void stepSetPrice(int price){
        new FlterPage().setPrice(Integer.toString(price));
    }

    @Step("Нажата кнопка - 'Показать подходящие'")
    public void stepClickSuitable(){
        new FlterPage().clickSuitable();
    }
}
