package FrameWork;

import FrameWork.utils.TestDetail;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import FrameWork.utils.PageInit;
import org.testng.Assert;

import static org.aspectj.bridge.Version.getText;

public class HomepageService extends PageInit {

    public HomepageService(){
        PageFactory.initElements(driver, this);
    }

    public HomepageService getUrl()
    {
        driver.get(TestDetail.getInstance().getProperty("web.url"));
        return this;
    }

    public static HomepageService init (){
        return new HomepageService();
    }

    public HomepageService openUrl()
    {
        HomepageService.init()
                .getUrl();
        return this;
    }

    public HomepageService buyproduct()
    {
        PageObjectAmazon.init()
                .enterProductName()
                .submitProductSearch()
                .clickProduct()
                .selectColor()
                .productBuyNow();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
        driver.close();
        return this;
    }

    public HomepageService VerifyPage()
    {
        if(driver.getTitle().contains("Amazon.in"))
            System.out.println("Page title contains as Expected");
        else
            System.out.println("Failed");
        driver.close();
        return this;
    }
}
