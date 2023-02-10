package by.step.aqa.framework.classtest.khabarova.block;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PikabuBlock extends BaseBlock{
    public PikabuBlock(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@class='input__input' and @name='username' and @minlength=3]")
    public WebElement loginField;

    @FindBy(xpath = "//input[@class='input__input' and @name='password' and @minlength=3]")
    public WebElement passwordField;

    @FindBy(xpath = "//iframe[@title='текущую проверку reCAPTCHA можно пройти в течение ещё двух минут']")
    public WebElement captcha;

    public By captchaBy = By.xpath("//iframe[@title='текущую проверку reCAPTCHA можно пройти в течение ещё двух минут']");

    @FindBy (xpath = "//form[@method='post']//button[@class='button_success button_width_100']")
    public WebElement loginButton;
}
