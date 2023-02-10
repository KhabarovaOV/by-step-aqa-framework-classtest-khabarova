package pikabu_page_test;

import by.step.aqa.framework.classtest.khabarova.base.BaseUITestClass;
import by.step.aqa.framework.classtest.khabarova.service.PikabuService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PikabuPageTest extends BaseUITestClass {
    private PikabuService pikabuService;

    @BeforeEach
    public void openLoginPage(){
        driver.navigate().to("https://pikabu.ru/");
    }

    @Test
    public void verifyLoginInputVisibility () {
        //Given
        pikabuService = new PikabuService(driver);

        //Then
        Assertions.assertEquals(false, pikabuService.getPikabuPage().getPikabuBlock().loginField.isDisplayed());

    }
    @Test
    public void verifyLoginInputValidParameters () {
        //Given
        String initialWrongLoginString = "qwerty";
        String initialPassword = "12345";

        pikabuService = new PikabuService(driver);
        pikabuService.getPikabuPage().getPikabuBlock().loginField.sendKeys(initialWrongLoginString);
        pikabuService.getPikabuPage().getPikabuBlock().passwordField.sendKeys(initialPassword);

        //When
        pikabuService.getPikabuPage().getPikabuBlock().loginButton.click();

        //Then
      //  Assertions.assertEquals(expectedErrormessage, actualErrorMessageText);
    }

    @Test
    public void verifyLoginInputInvalidParameters () {
        //Given
        String initialWrongLoginString = "qwerty";
        String initialPassword = "12345";
        pikabuService = new PikabuService(driver);
        pikabuService.getPikabuPage().getPikabuBlock().loginField.sendKeys(initialWrongLoginString);
        pikabuService.getPikabuPage().getPikabuBlock().passwordField.sendKeys(initialPassword);

        //When
        pikabuService.getPikabuPage().getPikabuBlock().loginButton.click();

        //Then
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(4000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(pikabuService.getPikabuPage().getPikabuBlock().captchaBy));
        Assertions.assertTrue(pikabuService.getPikabuPage().getPikabuBlock().captcha.isDisplayed(),"");
    }
}
