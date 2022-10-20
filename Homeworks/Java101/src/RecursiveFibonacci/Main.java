package RecursiveFibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        int num = input.nextInt();

        int res = fibonacci(num);
        System.out.println(res);
    }

    static int fibonacci(int x) {
        if(x==1){
            return 1;
        }else if (x==0){
            return 0;
        }else{
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }
}
