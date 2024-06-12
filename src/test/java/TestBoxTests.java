import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {

//    https://demoqa.com/text-box
    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");

        $("#userName").shouldBe(visible).setValue("Alexei Egorov");
        $("#userEmail").setValue("alexeiegorov@gmail.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address 2");
        $("#submit").click();
        $("#output").shouldHave(text("Alexei Egorov"), text("alexeiegorov@gmail.com"),
                text("Some address 1"), text("Another address 2"));


    }

    @Test
    void fillAnotherFormTest() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Georgiy");
        $("#lastName").setValue("Pobedonosets");
        $("#userEmail").setValue("geor@pobed.com");
        $("#gender-radio-3").parent().click();
        $(byText("Female")).click();
        $("#userNumber").setValue("1234567899");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("February");
        $(".react-datepicker__year-select").selectOption("1999");
        $(".react-datepicker__day--004:not(.react-datepicker__day--outside-month)").click();
//                react-datepicker__day react-datepicker__day--004 react-datepicker__day--outside-month
//        $("#subjectsContainer > div > div.subjects-auto-complete__indicators.css-1wy0on6").sendKeys("art");
    }
}
