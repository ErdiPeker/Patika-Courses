package Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r,area,circumference,partArea,angle;
        double PI=3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Radius:");
        r=input.nextDouble();
        System.out.print("Angle:");
        angle=input.nextDouble();

        circumference=2*PI*r;
        area=PI*r*r;
        partArea=area*angle/360;

        System.out.println("Toplam alan:" + area);
        System.out.println("Toplam cevre:"+ circumference);
        System.out.println("Dilim alan:" +partArea);
    }
}
