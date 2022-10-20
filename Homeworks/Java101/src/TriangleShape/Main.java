package TriangleShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz :");
        int num = input.nextInt();

        for(int i=0; i<num;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(num*2-i*2-1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
