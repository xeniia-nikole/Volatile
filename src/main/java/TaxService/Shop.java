package TaxService;

import java.util.concurrent.atomic.LongAdder;

public class Shop {
    private String name;
    private long revenue;
    private int time = (int) (Math.random()*(3600*24));
    private LongAdder longAdder;

    public Shop(String name, LongAdder longAdder) {
        this.name = name;
        this.longAdder = longAdder;
    }

    public void calculate() {
        for (int i = 0; i < 500; i++) {
            revenue = (long) (Math.random()*1_000_000);
            System.out.printf("\nБыла совершена покупка в магазине %s на %d рублей", name, revenue);
            longAdder.add(revenue);
        }
        System.out.printf("\nСегодняшняя выручка магазина %s составляет : " + longAdder, name);
    }
}
