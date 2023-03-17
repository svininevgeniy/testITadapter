package aeroPages;

import com.codeborne.selenide.SelenideElement;
import ru.testit.annotations.Step;
import ru.testit.annotations.Title;

import static com.codeborne.selenide.Selenide.$;

public class ViewBookingPage {
    private SelenideElement messageWithError = $("div.message_error");

    @Step
    @Title("Получение текста с ошибкой")
    public String getTextFromMessageWithError(){
        return messageWithError.getText();
    }
}
