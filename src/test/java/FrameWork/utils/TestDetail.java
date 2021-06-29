package FrameWork.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestDetail {

    private static final TestDetail testDetails = new TestDetail();
    private static Properties properties;

    public static final TestDetail getInstance() {
        TestDetail testProp = testDetails;
        testProp.init();
        return testProp;
    }

    private static void init() {

        if (properties == null) {
            properties = new Properties();
            try {
                FileInputStream inputStream = new FileInputStream(paths.getDetailPath());
                properties.load(inputStream);
            } catch (FileNotFoundException ex) {

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getProperty(String propertyName)
    {
        Object value = properties.get(propertyName);
            return properties.get(propertyName).toString();
    }

    public boolean getBooleanProperty(String propertyName) {
        return Boolean.parseBoolean(properties.getProperty(propertyName));
    }

    public Integer getIntegerProperty(String propertyName) {
        return Integer.parseInt(properties.getProperty(propertyName));
    }

}
