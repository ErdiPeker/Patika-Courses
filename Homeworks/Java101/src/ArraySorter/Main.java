package ArraySorter;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi uzunlugunu giriniz : ");
        int length=input.nextInt();
        int[] arr= new int[length];

        for(int i=0;i<length;i++){
            System.out.print(""+ (i+1) + ". sayiyi giriniz : ");
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Siralama : "+ Arrays.toString(arr));
    }
}
