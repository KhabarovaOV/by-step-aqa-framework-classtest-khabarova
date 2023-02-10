package by.step.aqa.framework.classtest.khabarova.service;

import by.step.aqa.framework.classtest.khabarova.page.PikabuPage;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;

public class PikabuService extends BaseService{
    private PikabuPage pikabuPage = new PikabuPage(driver);

    public PikabuService(WebDriver driver){
        super(driver);
    }
    public PikabuPage getPikabuPage(){
        return pikabuPage;
    }

}
