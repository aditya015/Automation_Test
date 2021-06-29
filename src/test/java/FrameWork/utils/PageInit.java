package FrameWork.utils;

import org.openqa.selenium.WebDriver;

public class PageInit {


    protected WebDriver driver;

    public PageInit()
    {
        driver = webdriverInstance.getWebDriverInstance();
    }
}
