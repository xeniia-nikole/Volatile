package TaxService;

import java.util.concurrent.Callable;

public class Shop implements Callable<Long> {
    private String name;
    private long revenue = (long) (Math.random()*1_000_000);


    @Override
    public Long call() throws Exception {
        return revenue;
    }
}
