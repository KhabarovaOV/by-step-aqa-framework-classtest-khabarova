package by.step.aqa.framework.classtest.khabarova.page;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver = driver;
    }
}
