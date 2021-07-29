package DONTTOUCHBOX;

public class Switch {
    volatile boolean isOpen = false;
    static int sleep = (int) (Math.random() * 15000);
    static int max = 10;

    public void close() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(sleep / 2);
                if (isOpen) {
                    System.out.println(Thread.currentThread().getName() +
                            "открывается, появляется жутко злой тигр.\n" +
                            "Тигр нецензурно ругается и закрывает коробку\n");
                    isOpen = false;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public void open() {
        try {
            while (max != 0) {
                if (!isOpen) {
                    Thread.sleep(sleep);
                    System.out.println(Thread.currentThread().getName() +
                            "тыкает в кнопку открытия \n");
                    isOpen = true;
                    max--;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
