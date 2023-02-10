package by.step.aqa.framework.classtest.khabarova.page;

import by.step.aqa.framework.classtest.khabarova.block.AdmeBlock;
import com.beust.ah.A;
import org.openqa.selenium.WebDriver;

public class AdmePage extends BasePage{
    private AdmeBlock admeBlock = new AdmeBlock(driver);

    public AdmePage (WebDriver driver){
        super(driver);
    }

    public AdmeBlock getAdmeBlock() {
        return admeBlock;
    }
}
