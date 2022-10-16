package Grocery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total,pear,perPear=2.14,apple,perApple=3.67,tomato,perTomato=1.11,banana,perBanana=0.95,aubergine,perAubergine=5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo:");
        pear=input.nextDouble();
        System.out.print("Elma kaç kilo:");
        apple=input.nextDouble();
        System.out.print("Domates kaç kilo:");
        tomato=input.nextDouble();
        System.out.print("Muz kaç kilo:");
        banana=input.nextDouble();
        System.out.print("Patlıcan kaç kilo:");
        aubergine=input.nextDouble();

        total=pear*perPear+apple*perApple+tomato*perTomato+banana*perBanana+aubergine*perAubergine;

        System.out.println("Toplam Tutar: " + total + "TL");

    }
}
