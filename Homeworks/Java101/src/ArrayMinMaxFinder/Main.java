package ArrayMinMaxFinder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15,12,788,1,-1,-778,0};
        int num= 1;
        Arrays.sort(arr);
        int i= Arrays.binarySearch(arr,num);
        System.out.println(Arrays.toString(arr));
        System.out.println(num);
        int a,f;
        if(i<0){
            a=arr[i*-1-2];
            f=arr[i*-1-1];
        }
        else{
            a=arr[i-1];
            f=arr[i+1];
        }
        System.out.println("Az olan sayı:"+a);
        System.out.println("Fazla olan sayı:"+f);


    }
}
