import java.util.concurrent.CountDownLatch;

/**
 * Created by dmaslov on 11/09/2017.
 */
public class Videoconference implements Runnable {

    private final CountDownLatch controller;

    public Videoconference(int number) {

        controller = new CountDownLatch(number);
    }

    public void arrive(String name) {

    }

    @Override
    public void run() {

        System.out.printf("%s has arrived ");
    }
}
