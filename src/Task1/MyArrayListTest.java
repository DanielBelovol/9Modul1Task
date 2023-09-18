package Task1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();


        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");
        myArrayList.add("6");
        myArrayList.add("7");
        myArrayList.add("8");
        myArrayList.add("9");
        myArrayList.add("912");
        myArrayList.add("9324");

        System.out.println(myArrayList.get(9));


    }
}