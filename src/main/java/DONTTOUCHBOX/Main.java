package DONTTOUCHBOX;

public class Main {
    public static void main(String[] args) {
        Switch s = new Switch();

        Thread toy = new Thread(null, s::close, "Коробка : ");
        Thread user = new Thread(null, s::open, "Пользователь : ");
        System.out.println("Старт!");
        try {
            toy.start();
            user.start();

            user.join();
            System.out.println("Конец");
            toy.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


