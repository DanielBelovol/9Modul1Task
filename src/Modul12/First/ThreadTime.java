package Modul12.First;

public class ThreadTime extends Thread{
    int counter = 0;
    public void run(){

        while(true){
            System.out.println(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter++;
        }


    }
}
