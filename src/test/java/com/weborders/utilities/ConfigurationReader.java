package com.weborders.utilities;

import io.cucumber.java.sl.In;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        //try with resources
        //allows to automatically close input stream when object is not used any more
        //works only for the classes that implement AutoCloseable interface
        try {
            InputStream in = new FileInputStream("configuration.properties");
            properties.load(in);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Filed to load configuration.properties file!");
        }
    }

    public static String getProperties(String key){
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(getProperties("browser"));
    }


}