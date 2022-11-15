package MultiThread;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer>  even = new ArrayList<>();

        Adder a1= new Adder(1,2500,odd,even);
        Adder a2= new Adder(2500,5000,odd,even);
        Adder a3= new Adder(5000,7500,odd,even);
        Adder a4= new Adder(7500,10000,odd,even);

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        Thread t3 = new Thread(a3);
        Thread t4 = new Thread(a4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.join();
        t4.join();

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(odd.stream().sorted());
        System.out.println(even.size());



    }
}
