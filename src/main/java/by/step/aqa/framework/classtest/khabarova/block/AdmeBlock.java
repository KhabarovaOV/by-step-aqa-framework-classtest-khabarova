package by.step.aqa.framework.classtest.khabarova.block;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdmeBlock extends BaseBlock{
    public AdmeBlock(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='c8d6297219d23efc9b6b']")
    public WebElement search;

    @FindBy(xpath = "//button[@class='c15cd81e8946610e0d56']")
    public WebElement closeReklama;

    @FindBy(xpath = "//div[@class='a726f45e4b4e66b98ddd']//input[@class='ce8502b0dbfc9d4b2089']")
    public WebElement clicksearch;
    public By clicksearchBy=By.xpath("//div[@class='a726f45e4b4e66b98ddd']//input[@class='ce8502b0dbfc9d4b2089']");


}
