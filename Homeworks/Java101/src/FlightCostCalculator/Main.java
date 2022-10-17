package FlightCostCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance,age,isRoundTrip;
        double ageDiscount=0.0,roundDiscount=0.0,cost;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        distance=input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age=input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1=> Tek Yön, 2=> Gidiş Dönüş) : ");
        isRoundTrip=input.nextInt();

        if(distance<0 || age<0 || isRoundTrip<1 || isRoundTrip>2){
            System.out.println("Hatalı Veri Girdiniz!");
        }
        else{
            if(age<=12){
                ageDiscount=0.5;
            }else if( age<=24){
                ageDiscount=0.1;
            }else if(age>=65){
                ageDiscount=0.3;
            }

            if(isRoundTrip==2){
                roundDiscount=0.2;
            }

            cost=distance*0.1*(1.0-ageDiscount)*(1.0-roundDiscount)*isRoundTrip;

            System.out.println("Toplam tutar : " + cost + "TL");
        }


    }
}
