import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class registerForm {

   @BeforeAll
   static void beforeAll(){
      Configuration.browserSize = "1920x1080";
      Configuration.baseUrl = "https://demoqa.com";
   };
    @Test
    void firstTest(){ open("/automation-practice-form");
       executeJavaScript("$('#fixedban').remove()");
       executeJavaScript("$('footer').remove()");

       $("#firstName").setValue("Test");
       $("#lastName").setValue("Testovich");
       $("#userEmail").setValue("User@name.ru");
       $(".custom-control-label").click();  ///setGander
       $("#userNumber").setValue("0123456789");

       $("#dateOfBirthInput").click();
       $(".react-datepicker__month-select").$(byText("March")).click();
       $(".react-datepicker__year-select").$(byText("1999")).click();
       $(".react-datepicker__month-container").$(byText("11")).click();

       $x("//*[@id=\"subjectsContainer\"]").click();  // == $("subjectsInput").click();
       $("#subjectsInput").setValue("Math").pressEnter();

       $(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
       $(By.cssSelector("label[for='hobbies-checkbox-2']")).click();
       $(By.cssSelector("label[for='hobbies-checkbox-3']")).click();

       $("#uploadPicture").uploadFromClasspath("Test.png");

       $("#currentAddress").setValue("Lenina street");

       $("#state").click();
       $("#react-select-3-option-2").click();
       $("#city").click();
       $("#react-select-4-option-0").click();
       $("#submit").click();
       sleep(5000);
} }