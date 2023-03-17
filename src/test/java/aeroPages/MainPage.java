package aeroPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.testit.annotations.Step;
import ru.testit.annotations.Title;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement aeroImg = $("[alt = '«Авиакомпания «Победа», Группа «Аэрофлот»']");
    private SelenideElement informationDropdown = $("a[href = '/information']");
    private SelenideElement headerOneOfInformationDropdown = $("a[href = '/information#flight'] div");
    private SelenideElement headerTwoOfInformationDropdown = $("a[href = '/information#useful'] div");
    private SelenideElement headerThreeOfInformationDropdown = $("a[href = '/information#company'] div");
    private SelenideElement bookingManagementTab = $("button.dp-re40sj:nth-child(3)");

    @Step
    @Title("Проверка наличия логотипа")
    public void AeroImgIsDisplayed(){
        aeroImg.should(Condition.visible, Duration.ofSeconds(10));
    }

    @Step
    @Title("Наведение курсора на выпадающий список 'Информация'")
    public void hoverToInformationDropdown(){
        informationDropdown.hover();
    }

    @Step
    @Title("Получение текста из Заголовка №1 выпадающего списка 'Информация'")
    public SelenideElement getHeaderOneOfInformationDropdown(){
        return headerOneOfInformationDropdown;
    }

    @Step
    @Title("Получение текста из Заголовка №2 выпадающего списка 'Информация'")
    public SelenideElement getHeaderTwoOfInformationDropdown() {
        return headerTwoOfInformationDropdown;
    }

    @Step
    @Title("Получение текста из Заголовка №3 выпадающего списка 'Информация'")
    public SelenideElement getHeaderThreeOfInformationDropdown() {
        return headerThreeOfInformationDropdown;
    }

    @Step
    @Title("Переход на страницу 'Управление бронированием'")
    public BookingManagementForm clickToBookingManagementTab(){
        bookingManagementTab.click();
        return new BookingManagementForm();
    }
}
