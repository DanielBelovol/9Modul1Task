package FileTask2;

import java.io.*;

public class FileTask2Test {
    public static void main(String[] args) throws FileNotFoundException {
        FileTask2 user = new FileTask2("Danya",15);
        user.serializeObject(user, "user.json");

        FileTask2 deserializeUser = user.deserialize("user.json");
        System.out.println(deserializeUser);

        user.getNameUser();
    }


}
