import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread(60,80);
        Thread thread1_1 = new Thread(thread1);
        thread1_1.start();
        thread1_1.join();
        int car_speed = 0;
        boolean finished = false;
        double way = 0.1; // kilometers
        Random speed = new Random();
        while (!finished){
            car_speed = thread1.getRandom();
            if((way/car_speed*60)<=0){
                System.out.println("Finish");
                finished = true;
            }
            else{
                System.out.println(String.valueOf(car_speed)+ " km/h, "+String.format("remaining time: %.2f",(way/car_speed*60)) +" minutes" + String.format(" remaining way: %.2f kilometers",(way)));
                way-=car_speed*1000/3600.00/1000;
            }
            Thread.sleep(1000);
        }
    }
}