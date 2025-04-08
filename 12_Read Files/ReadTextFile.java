package read_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir")+
                "/src/test/resources/test.txt";

        Path path = Paths.get(filePath);
        List<String> fileLines = Files.readAllLines(path);
        for (String x:fileLines)
            System.out.println(x);
    }
}
