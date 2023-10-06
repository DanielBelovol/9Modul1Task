package Function.FunctionTask3;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5","45, 62, 11"};

        ArrayGet<String[]> arrayGet = (arr) ->{
            List<Integer> nums = new ArrayList();
            for (String element : arr) {
                String[] elementsArray = element.split(", ");
                for (String numStr : elementsArray) {
                    nums.add(Integer.parseInt(numStr));
                }
            }
            Collections.sort(nums);
            System.out.println(nums);
        };
        arrayGet.getAndSort(array);
    }

    
}
