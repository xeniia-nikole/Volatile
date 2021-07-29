package TaxService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LongAdder longAdder = new LongAdder();

        Shop shop1 = new Shop("Dixie", longAdder);
        Shop shop2 = new Shop("7-Eleven", longAdder);
        Shop shop3 = new Shop("Carousel", longAdder);


        Thread thread1 = new Thread(null, shop1::calculate, "1");
        Thread thread2 = new Thread(null, shop2::calculate, "2");
        Thread thread3 = new Thread(null, shop3::calculate, "3");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("\nОбщая выручка составляет : " + longAdder);
    }
}
