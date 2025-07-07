package network;

import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class Configuration {
    private Properties properties;

    public Configuration() {
        properties = new Properties();
        loadConfiguration();
    }

    private void loadConfiguration() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public void setProperty(String key, String value) {
        properties.setProperty(key, value);
    }
}