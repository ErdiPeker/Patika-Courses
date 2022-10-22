package ArrayAverage;

public class Main {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,66};
        double divisor= 0.0;
        for(int i:arr){
            divisor+=1.0/i;
        }
        System.out.println("Serinin harmonik ortalaması : " + arr.length/divisor);
    }
}