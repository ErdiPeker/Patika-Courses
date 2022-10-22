package ArrayDuplicateEvenNumbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,2,3,4,5,6};
        int[] duplicate = new int[arr.length];

        for(int i=0; i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(i!=j && arr[i]%2==0 && arr[i]==arr[j]){
                    duplicate[i]=arr[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
