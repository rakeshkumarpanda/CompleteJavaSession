package read_files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
    public static void main(String[] args) throws IOException {
        String basePath = System.getProperty("user.dir");
        String filePath = basePath + "/src/test/resources/test.properties";

        //Read Data from Properties file
        Properties properties = new Properties();
        properties.load(new FileInputStream(filePath));
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println(username+"\t"+password);
    }
}
