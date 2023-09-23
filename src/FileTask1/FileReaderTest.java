package FileTask1;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();

        System.out.println(fileReader.verifyNumbers());
    }

}
