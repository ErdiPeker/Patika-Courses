package RecursivePrimeNumbers;

import javax.swing.text.Style;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz : ");
        int num = input.nextInt();

        boolean a =isPrime(num,num/2);
        System.out.println(a);
    }
    static boolean isPrime(int num,int div){
        if(div==1){
            return true;
        }else if(num%div==0){
            return false;
        }else{
            return isPrime(num,div-1);
        }
    }
}
