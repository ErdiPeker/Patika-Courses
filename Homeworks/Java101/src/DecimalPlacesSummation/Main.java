package DecimalPlacesSummation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,result=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        num = input.nextInt();

        while(num>0){
            result+=num%10;
            num/=10;
        }
        System.out.println(result);
    }
}
