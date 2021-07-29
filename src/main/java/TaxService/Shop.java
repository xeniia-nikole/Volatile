package TaxService;

import java.util.concurrent.atomic.LongAdder;

public class Shop {
    private String name;
    private long revenue = (long) (Math.random()*1_000_000);
    private LongAdder longAdder;

    public Shop(String name, LongAdder longAdder) {
        this.name = name;
        this.longAdder = longAdder;
    }

    public void calculate() {
        System.out.printf("\nСегодняшняя выручка магазина %s составляет: " + revenue, name);
        longAdder.add(revenue);
    }
}
