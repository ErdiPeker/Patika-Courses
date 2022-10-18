package DiamondShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        num=input.nextInt();

        for(int i=1; i<=num ; i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=1; i<num ; i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*num-2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
