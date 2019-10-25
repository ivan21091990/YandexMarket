package steps;

import pages.ResultPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ResultSteps{

    @Step("выполняем проверку соответствия наименования отображенного товара скопированному значению")
    public void stepCheckTitle(){
        new ResultPage().checkTitle();
    }
}
