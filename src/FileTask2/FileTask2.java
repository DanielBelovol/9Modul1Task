package FileTask2;

import java.io.*;
import java.util.Scanner;

public class FileTask2 implements Serializable {
    private String name;
    private int age;

    public FileTask2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                "age=" + age;
    }

    static FileTask2 deserialize(String fiePath) {
        try (InputStream fis = new FileInputStream(fiePath);
             ObjectInputStream in = new ObjectInputStream(fis)) {

            return (FileTask2) in.readObject();

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    static void serializeObject(Object input, String filePath) {
        try (OutputStream fos = new FileOutputStream(filePath)
             ; ObjectOutputStream out = new ObjectOutputStream(fos)) {

            out.writeObject(input);

        } catch (IOException e) {
            throw new RuntimeException();
        }

    }

    public String getNameUser() throws FileNotFoundException {
        int counter = 0;
        File file = new File("UserData.txt");
        FileInputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(fis);
        String name = "";
        while (scanner.hasNext()) {
            counter++;
            if (counter > 0) {
                name = scanner.nextLine();
            }
        }
        return name;

    }

}
