package Function.FunctionTask2;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Start {
    public static void main(String[] args) {
        String text = "Danya, David, Max, Alex, Masha, Andrew";

        Sort<String> sort = (textSort)-> {
            List<String> list= new ArrayList<>(Arrays.asList(textSort.split(", ")));

            Collections.sort(list);

            return list.toString();
        };

        System.out.println(sort.sorting(text));
    }
}
