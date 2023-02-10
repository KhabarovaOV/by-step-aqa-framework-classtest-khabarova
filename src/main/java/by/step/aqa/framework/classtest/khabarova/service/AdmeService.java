package by.step.aqa.framework.classtest.khabarova.service;

import by.step.aqa.framework.classtest.khabarova.page.AdmePage;
import org.openqa.selenium.WebDriver;

public class AdmeService extends BaseService{
    AdmePage admePage = new AdmePage(driver);
    public AdmeService (WebDriver driver){
        super(driver);
    }

    public AdmePage getAdmePage() {
        return admePage;
    }
}
