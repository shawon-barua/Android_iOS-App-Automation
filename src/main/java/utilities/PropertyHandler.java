package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyHandler {
    Properties properties;

    public PropertyHandler() {
        properties=loadConfigPropertyFile();
    }

    private Properties loadConfigPropertyFile(){

        Properties p= new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("config.properties");
            p.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return  p;
    }

    public String getPropertyValue(String propertyName){
        return properties.getProperty(propertyName);
    }
}
