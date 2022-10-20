package PrimeNumberFinder;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz :");
        int num = input.nextInt();

        for(int i=2;i<=num;i++){
            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.print(" "+i);
            }
        }
    }
}
