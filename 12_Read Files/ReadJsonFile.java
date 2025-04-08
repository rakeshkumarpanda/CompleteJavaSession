package read_files;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ReadJsonFile {
      public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/test.JSON";

        DocumentContext parse = JsonPath.parse(new File(filePath));

        String firstName = parse.read("$.firstName");
        System.out.println(firstName);

        Map<String, Object> address = parse.read("$.address");
        System.out.println(address);

        List<Map<String, Object>> phoneNumbers = parse.read("$.phoneNumbers");
        System.out.println(phoneNumbers);

    }
}
