import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class openPage {

    @Test
    void firstTest(){ open("https://demoqa.com/automation-practice-form");
       $("#firstName").setValue("Name");
       $("#lastName").setValue("LastName");
       $("#userEmail").setValue("User@name.ru");
       $("#userNumber").setValue("123456789");
       $("#currentAddress").setValue("Lenina Streets build 1");

} }
