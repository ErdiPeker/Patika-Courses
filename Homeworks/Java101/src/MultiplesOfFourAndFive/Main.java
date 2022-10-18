package MultiplesOfFourAndFive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num4=1,num5=1,limit;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        limit=input.nextInt();

        System.out.print("4'ün kuvvetleri : ");
        while(num4<limit){
            System.out.print(num4 + ",");
            num4*=4;
        }
        System.out.println("");
        System.out.print("5'in kuvvetleri : ");
        while(num5<limit){
            System.out.print(num5 + ",");
            num5*=5;
        }
    }
}
