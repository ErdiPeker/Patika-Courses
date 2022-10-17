package LeapYearChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Boolean isLeapYear;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        if(year%400==0){
            isLeapYear=true;
        }else if (year%100==0){
            isLeapYear=false;
        }else if (year%4==0){
            isLeapYear=true;
        }else{
            isLeapYear=false;
        }

        if (isLeapYear) {
            System.out.println(""+year+" bir artık yıldır !");
        }else{
            System.out.println(""+year+" bir artık yıl değildir !");
        }
    }
}
