package Modul12.First;

public class Thread5Time extends Thread{
    int counter = 0;
        public void run(){
            while(true){
                if(counter%5==0&&counter!=0){
                    System.out.println("Минуло 5 секунд");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                counter++;
            }
        }
}
