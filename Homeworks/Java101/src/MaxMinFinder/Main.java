package MaxMinFinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz? : ");
        int adet= input.nextInt();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        for(int i=1; i<=adet ; i++){
            System.out.print(""+i+". sayiyi giriniz :");
            int num=input.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }

        }
        System.out.println("En Küçük sayı : "+min+"\nEn büyük sayı :"+max);
    }
}
