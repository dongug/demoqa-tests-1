import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {

//    https://demoqa.com/text-box
    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Alexei Egorov");
        $("#userEmail").setValue("alexeiegorov@gmail.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address 2");
        $("#submit").click();
        $("#output").shouldHave(text("Alexei Egorov"), text("alexeiegorov@gmail.com"),
                text("Some address 1"), text("Another address 2"));


    }
}
