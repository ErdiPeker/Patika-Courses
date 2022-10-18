package FourMultiplesSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,sum=0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı Giriniz : ");
            num=input.nextInt();
            if(num%4==0){
                sum+=num;
            }
        }while(num%2==0);
        System.out.println("4'ün katlarındaki sayıların toplamı : "+ sum);
    }
}
