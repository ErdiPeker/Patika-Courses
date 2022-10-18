package HarmonicSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        double res=0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        num=input.nextInt();

        for(int i=1;i<=num;i++){
            res+=(1.0/i);
        }
        System.out.println(res);
    }
}
