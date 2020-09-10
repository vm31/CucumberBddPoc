package helper;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utility {
    public String readPropertyFile(String propertyName) throws IOException {
        String propertyValue = null;

        Properties prop=new Properties();
        try {
            InputStream input = new FileInputStream("data.properties");
            prop.load(input);
           propertyValue= prop.getProperty(propertyName);
        } catch (Exception e) {
            e.printStackTrace();
        }return propertyValue;
    }


}
