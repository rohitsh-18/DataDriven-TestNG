package utils;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class Utility {

    public static String fetchPropertyvalue(String key) throws Exception{
        FileInputStream file = new FileInputStream("./config.properties");
        Properties property = new Properties();
        property.load(file);
        return property.getProperty(key).toString();
    }

    public static String fetchLocatorValue(String key) throws Exception{
        FileInputStream file = new FileInputStream("config/Elements.properties");
        Properties property = new Properties();
        property.load(file);
        return property.getProperty(key).toString();
    }

    public static Properties readProperitesFile() throws Exception{
        FileInputStream file = new FileInputStream("./config.properties");
        Properties property = new Properties();
        property.load(file);
        return property;
    }

    public static void loadPropertiesObjectInHashMap(Properties prop, HashMap<String, String> propMap){
        for (Map.Entry<Object, Object> entry : prop.entrySet()) {
            propMap.put((String) entry.getKey(), (String) entry.getValue());
        }
    }
}

