package com.github.mcengine.essential;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Checks {
    public static String getPropertiesValue(String path, String key) {
        Properties properties = new Properties();
        InputStream input = null;
        String result = null; // Declare result outside the try block
    
        try {
            // Load the properties file
            input = new FileInputStream(path);
            properties.load(input);
    
            // Retrieve the value of the specified key from properties
            result = properties.getProperty(key);
    
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception (e.g., log the error or throw a custom exception)
        } finally {
            // Close the input stream
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    
        return result;
    }
}
