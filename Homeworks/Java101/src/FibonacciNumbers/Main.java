package FibonacciNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        int num = input.nextInt();
        int s=0,l=1;
        System.out.print(""+num+" elemanli fibonnacci serisi : 0");
        for(int i=1; i<=num;i++){
            System.out.print(" "+l);
            int temp=l;
            s+=l;
            l=s;
            s=temp;
        }

    }
}
