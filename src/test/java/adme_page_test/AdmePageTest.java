package adme_page_test;

import by.step.aqa.framework.classtest.khabarova.base.BaseUITestClass;
import by.step.aqa.framework.classtest.khabarova.service.AdmeService;
import by.step.aqa.framework.classtest.khabarova.service.PikabuService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AdmePageTest extends BaseUITestClass {
    private AdmeService admeService;

    @BeforeEach
    public void openLoginPage(){
        driver.navigate().to("https://adme.media/");
    }

    @Test
    public void verifyLoginInputVisibility () {
        //Given
        admeService = new AdmeService(driver);

        //Then
        Assertions.assertEquals(false, admeService.getAdmePage().getAdmeBlock());

    }

    @Test
    public void searchInformation () {
        //Given

        String searchText = "Рецепты";
        admeService = new AdmeService(driver);

        admeService.getAdmePage().getAdmeBlock().closeReklama.click();
        admeService.getAdmePage().getAdmeBlock().search.click();
        admeService.getAdmePage().getAdmeBlock().clicksearch.sendKeys(searchText);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(4000));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) admeService.getAdmePage().getAdmeBlock().clicksearchBy));

    /*    admeService.getPikabuPage().getPikabuBlock().loginField.sendKeys(initialWrongLoginString);
        admeService.getPikabuPage().getPikabuBlock().passwordField.sendKeys(initialPassword);

        //When
        admeService.getPikabuPage().getPikabuBlock().loginButton.click();*/
    }


}
