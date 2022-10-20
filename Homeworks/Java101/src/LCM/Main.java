package LCM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Küçük sayıyı giriniz : ");
        int small= input.nextInt();
        System.out.print("Büyük sayıyı giriniz : ");
        int large= input.nextInt();
        int hcf=1;
        int diff=1,mul=small*large;
        while(diff>0){
            diff=large-small;
            if(large%diff==0){
                hcf=diff;
                break;
            }else{
                int m=large/diff;
                int temp=small;
                small=large-m*diff;
                large=temp;
            }
        }
        System.out.println("EBOB : "+hcf);
        int lcm=mul/hcf;
        System.out.println("EKOK : "+lcm);

    }
}
