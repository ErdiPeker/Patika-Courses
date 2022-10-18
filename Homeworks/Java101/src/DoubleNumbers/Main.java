package DoubleNumbers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k,sum=0,num=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        k=input.nextInt();

        for(int i=12;i<=k;i+=12){
            sum+=i;
            num++;
        }

        if(num==0){
            System.out.println("Ortalama : "+ num);
        }else{
            double ave= sum/num;
            System.out.println("Ortalama : "+ ave);
        }

    }
}
