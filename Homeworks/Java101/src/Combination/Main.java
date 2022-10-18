package Combination;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, group, n, r;
        double result = 1.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Küme boyutunu giriniz : ");
        num = input.nextInt();
        System.out.print("Gruplama boyutunu giriniz : ");
        group = input.nextInt();

        n = num;
        r = group;
        while (n > 0) {
            result *= n;
            result /= r;
            n--;
            r--;
            if (r == 0) {
                r = num - group;
            }
        }
        System.out.println(result);


    }
}
