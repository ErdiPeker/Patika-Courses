package Taximeter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km,perKm=2.2,total,start=10.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe:");
        km=input.nextDouble();

        total= start+km*perKm;
        total= (total<20.0) ? 20.0 : total;
        System.out.println("Odenecek Tutar:" + total);
    }

}
