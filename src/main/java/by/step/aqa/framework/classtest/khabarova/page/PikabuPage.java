package by.step.aqa.framework.classtest.khabarova.page;

import by.step.aqa.framework.classtest.khabarova.block.PikabuBlock;
import org.openqa.selenium.WebDriver;

public class PikabuPage extends BasePage{
     private PikabuBlock pikabuBlock = new PikabuBlock(driver);
     public PikabuPage (WebDriver driver){
         super(driver);
     }

    public PikabuBlock getPikabuBlock() {
        return pikabuBlock;
    }
}
