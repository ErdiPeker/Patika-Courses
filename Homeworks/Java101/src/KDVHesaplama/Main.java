package KDVHesaplama;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18,kdv,toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Fiyatı Giriniz:");
        tutar= input.nextDouble();

        kdv=tutar*kdvOran;
        toplam=tutar+kdv;

        System.out.println("KDV Oranı = " + kdvOran);
        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV'li Fiyat = " + toplam);
        System.out.println("KDV Tutarı = " + kdv);
    }



}
