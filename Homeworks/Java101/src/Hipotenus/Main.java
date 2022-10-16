package Hipotenus;
import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        double first,second,hipo;
        
        Scanner input = new Scanner(System.in);
        System.out.print("İlk kenarı giriniz:");
        first=input.nextDouble();
        System.out.print("İkinci kenarı giriniz:");
        second=input.nextDouble();

        hipo = Math.sqrt(first*first+second*second);
        System.out.println("Hipotenüs uzunluğu : "+ hipo);
    }
}
