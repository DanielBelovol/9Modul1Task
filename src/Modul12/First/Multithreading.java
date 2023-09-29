package Modul12.First;


public class Multithreading extends Thread {
    public static void main(String[] args) {
        new ThreadTime().start();
        new Thread5Time().start();
    }
}
