package MultiThread;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;

public class Adder implements Runnable {
    private int start;
    private int end;
    public ArrayList<Integer> odd;
    public ArrayList<Integer> even;

    public Adder(int start, int end, ArrayList<Integer> odd, ArrayList<Integer> even) {
        this.start = start;
        this.end = end;
        this.odd = odd;
        this.even = even;
    }

    @Override
    public void run() {
        for (int i = this.getStart(); i < this.getEnd(); i++) {
            if (i % 2 == 0) {
                this.even.add(i);
            }else{
                this.odd.add(i);
            }
        }
        System.out.println(Thread.currentThread().getName());

    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
