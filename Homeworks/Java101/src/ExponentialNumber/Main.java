package ExponentialNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base,exp,res=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Baz sayıyı giriniz : ");
        base = input.nextInt();
        System.out.print("Üs sayısını giriniz : ");
        exp = input.nextInt();

        for(int i=0;i<exp;i++){
            res*=base;
        }
        System.out.println("Sonuç : " + res);
    }
}
