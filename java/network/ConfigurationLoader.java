package network;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationLoader {
    private Properties properties;

    public ConfigurationLoader(String configFilePath) {
        properties = new Properties();
        loadConfiguration(configFilePath);
    }

    private void loadConfiguration(String configFilePath) {
        try (FileInputStream input = new FileInputStream(configFilePath)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception as needed
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public int getIntProperty(String key, int defaultValue) {
        String value = properties.getProperty(key);
        return (value != null) ? Integer.parseInt(value) : defaultValue;
    }

    public boolean getBooleanProperty(String key, boolean defaultValue) {
        String value = properties.getProperty(key);
        return (value != null) ? Boolean.parseBoolean(value) : defaultValue;
    }
}