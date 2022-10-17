package ZodiacSignFinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month, date;
        String zodiac="";
        Boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün : ");
        day = input.nextInt();

        date = month * 100 + day;


        if (date >= 122 && date <= 219) {
            zodiac = "Kova";
        } else if (date >= 220 && date <= 320) {
            zodiac = "Balık";
        } else if (date >= 321 && date <= 420) {
            zodiac = "Koç";
        } else if (date >= 421 && date <= 521) {
            zodiac = "Boğa";
        } else if (date >= 522 && date <= 622) {
            zodiac = "İkizler";
        } else if (date >= 623 && date <= 722) {
            zodiac = "Yengeç";
        } else if (date >= 723 && date <= 822) {
            zodiac = "Aslan";
        } else if (date >= 823 && date <= 922) {
            zodiac = "Başak";
        } else if (date >= 923 && date <= 1022) {
            zodiac = "Terazi";
        } else if (date >= 1023 && date <= 1121) {
            zodiac = "Akrep";
        } else if (date >= 1122 && date <= 1221) {
            zodiac = "Yay";
        } else if ((date >= 101 && date <= 121) || (date >= 1222 && date <= 1231)) {
            zodiac = "Oğlak";
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz");
        } else {
            System.out.println("Burcunuz:" + zodiac);
        }
    }
}
