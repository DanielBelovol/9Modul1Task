package FileTask3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class WordsCounter implements Comparator {
    File file = new File("word.txt");
    FileInputStream fis = new FileInputStream(file);
    Scanner scanner = new Scanner(fis);
    Map<String,Integer> hashMap = new HashMap<>();
    String text = "";

    public WordsCounter() throws FileNotFoundException {
    }

    public void getCountWord(){
            int counter = 0;
            int start= 0;
            String[] stringSplit;
            while(scanner.hasNext()){
                text = scanner.nextLine();
            }
            stringSplit = text.split(" ");
            for(String element: stringSplit){
                hashMap.put(element, hashMap.getOrDefault(element, 0) + 1);
            }
            for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }

            }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}



