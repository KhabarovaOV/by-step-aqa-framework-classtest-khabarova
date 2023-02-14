package by.step.aqa.framework.classtest.khabarova.service;

import by.step.aqa.framework.classtest.khabarova.page.PikabuPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;



public class PikabuService extends BaseService{
    private PikabuPage pikabuPage = new PikabuPage(driver);

    public PikabuService(WebDriver driver){
        super(driver);
    }
    public PikabuPage getPikabuPage(){
        Logger log = LoggerFactory.getLogger(PikabuService.class);
        log.trace( "New error find");
        return pikabuPage;
    }

}
