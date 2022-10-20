package RecursiveModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        int num = input.nextInt();
        int dir = -5;
        recur(num,num,dir);
    }
    static void recur(int num,int printedNum,int dir){
        if(printedNum<1) dir*=-1;
        System.out.print(printedNum+" ");
        if(num==printedNum && dir>0) return;
        recur(num,printedNum+dir,dir);
    }
}
