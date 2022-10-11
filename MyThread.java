import java.util.Random;

public class MyThread implements Runnable {
    private int min;
    private int max;
    private int temp;
    private Random number = new Random();

    public MyThread(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public void run() {
        this.temp = number.nextInt(max-min)+min;
    }

    public int getRandom() {
        this.temp = number.nextInt(max-min)+min;
        return temp;
    }
}