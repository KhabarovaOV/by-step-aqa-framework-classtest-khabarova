package by.step.aqa.framework.classtest.khabarova.service;

import by.step.aqa.framework.classtest.khabarova.page.AdmePage;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AdmeService extends BaseService{
    AdmePage admePage = new AdmePage(driver);
    public AdmeService (WebDriver driver){
        super(driver);
    }

    public AdmePage getAdmePage() {
        Logger log = Logger.getLogger(AdmeService.class.getName());
        log.log(Level.WARNING, "Find error");
        return admePage;
    }
}
