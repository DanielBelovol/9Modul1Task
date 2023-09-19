package FileTask1;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class FileReader extends InputStream {
    private Queue<Byte> queue = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        FileInputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(fis);
        String text;
        while (scanner.hasNext()){
            
        }




    }

    @Override
    public int read() throws IOException {
        return 0;
    }
}
