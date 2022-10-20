package RecursiveExponantialCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degeri giriniz : ");
        int base=input.nextInt();
        System.out.print("Us degeri giriniz : ");
        int exp=input.nextInt();

        System.out.println(exponantial(base,exp));

    }
    static int exponantial(int base,int exp){
        if(exp==1) return base;
        else return base *exponantial(base,exp-1);
    }
}
