package Modul12.Second;

public class ThreadClass extends Thread{
    public int counter = 1;
    public int value;

    public ThreadClass(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        Thread numPrinter = new Thread(()-> {
            try {
                printNum();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread fizz = new Thread(()-> {
            try {
                fizz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread buzz = new Thread(()-> {
            try {
                buzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread fizzbuzz = new Thread(()-> {
            try {
                fizzbuzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        numPrinter.start();
        fizz.start();
        buzz.start();
        fizzbuzz.start();

        try {
            // Wait for all threads to finish
            numPrinter.join();
            fizz.join();
            buzz.join();
            fizzbuzz.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void fizz() throws InterruptedException {
        while (counter <= value) {
            if (counter % 3 == 0&&counter%5!=0) {
                System.out.println("fizz");
                counter++;
                notifyAll();
            } else {
                wait();
            }
        }
    }
    public synchronized void buzz() throws InterruptedException {
        while(counter<=value){
            if(counter%5 == 0){
                System.out.println("buzz");
                counter++;
                notifyAll();
            }
            else {
                wait();
            }
        }
    }
    public synchronized void  fizzbuzz() throws InterruptedException {
        while(counter<=value){
            if(counter%5 == 0&&counter % 3 == 0){
                System.out.println("fizzbuzz");
                counter++;
                notifyAll();
            }else wait();
        }
    }
    public synchronized void printNum() throws InterruptedException {
        while(counter<=value){
            if(counter%5 != 0&&counter % 3 != 0){
                System.out.println(counter);
                counter++;
                notifyAll();
            }else wait();
        }

    }

}
