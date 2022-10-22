package NumberGuesser;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 100);
        int right = 5;
        int[] guessArr = new int[right];

        Scanner input = new Scanner(System.in);
        System.out.println("Sayi tahmini oyununa hosgeldiniz!");

        for (int i = 0; i < right; i++) {
            System.out.print("Tahmininiz : ");
            int guess = input.nextInt();
            guessArr[i]=guess;

            if (guess < 0 || guess > 100) {
                System.out.println("Sayi tahmini 0 ile 100 arasinda olmalıdır!");
            } else if (guess < rand) {
                System.out.println("Tahmininiz, bulmaniz gereken sayidan küçüktür!");
            } else if (guess == rand) {
                System.out.println("Tebrikler, kazandiniz!");
                break;
            } else{
                System.out.println("Tahmininiz, bulmaniz gereken sayidan büyüktür!");
            }
            System.out.println("Kalan hakkiniz : "+(right-i-1));
            System.out.println("Simdiye kadar tahminleriniz : "+ Arrays.toString(guessArr));

        }
    }
}
