package PalindromeChecker;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(545));

    }
    static boolean isPalindrome(int num){
        int reversed=0,temp=num;
        while(temp>0){
            reversed=10*reversed+temp%10;
            temp/=10;
        }
        if(num==reversed){
            return true;
        }
        else return false;
    }
}
