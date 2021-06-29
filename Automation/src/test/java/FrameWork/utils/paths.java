package FrameWork.utils;

public class paths {

    private final static String CHROME_DRIVER_PATH = "./src/test/java/FrameWork/driver/chromedriver.exe";
    private final static String DETAIL_PATH = "./src/test/java/FrameWork/utils/TestDetails.properties";
    private static String BROWSER_FILE_PATH = "";

    public static String getChromeDriverPath()
    {
        return CHROME_DRIVER_PATH;
    }

    public static String getDetailPath()
    {
        return DETAIL_PATH;
    }
    public static String getBrowserFilePath()
    {
        return BROWSER_FILE_PATH;
    }
    public static void setBrowserFilePath(String browserFilePath)
    {
        BROWSER_FILE_PATH = browserFilePath;
    }


}

