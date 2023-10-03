package FileTask3;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class WordsCounter {
    File file = new File("word.txt");
    FileInputStream fis = new FileInputStream(file);
    Scanner scanner = new Scanner(fis);
    Map<String, Integer> hashMap = new TreeMap<>();
    StringBuilder text = new StringBuilder();
    String text1;


    public WordsCounter() throws FileNotFoundException {
    }

    public void getCountWord() {
        int counter = 0;
        int start = 0;
        String[] stringSplit;
        while (scanner.hasNext()) {
            text.append(scanner.nextLine()).append(" ");
        }
        text1 = text.toString();
        stringSplit = text1.split(" ");
        for (String element : stringSplit) {
            hashMap.put(element, hashMap.getOrDefault(element, 0) + 1);
        }

        Comparator<Map.Entry<String, Integer>> valueComparator = (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue());


        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(hashMap.entrySet());
        sortedEntries.sort(valueComparator);


        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }


}



