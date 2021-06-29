package FrameWork.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;


public class webdriverInstance {

    private static WebDriver webDriver;

    public static WebDriver getWebDriverInstance() {

        if (webDriver == null) {
            webDriver = createWebDriverInstance();
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            webDriver.manage().window().maximize();
        }

        return webDriver;
    }

    public static boolean isDriverInstanceExist() {
        if (webDriver != null) return true;
        else return false;
    }

    public static WebDriver createWebDriverInstance() {

        System.setProperty("webdriver.chrome.driver", paths.getChromeDriverPath());

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", paths.getBrowserFilePath());
        chromePrefs.put(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
                org.openqa.selenium.UnexpectedAlertBehaviour.ACCEPT);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.addArguments("--ignore-certificate-errors");
        options.setCapability(ChromeOptions.CAPABILITY, options);
        options.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        options.setCapability("chrome.switches", Arrays.asList("--incognito"));

        return new ChromeDriver(options);
    }

    public static void killWebDriverInstance() {

        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }
}