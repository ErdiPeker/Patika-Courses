package IsPerfectNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        int num=input.nextInt();
        int sum=0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if (num<=1) {
            System.out.println("Not a Perfect Number");
        }else if(sum==num){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a Perfect Number");
        }

    }
}
