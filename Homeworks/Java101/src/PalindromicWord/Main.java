package PalindromicWord;

public class Main {
    static boolean isPalindrome(String str){
        int l=0,r=str.length()-1;
        while (l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba"));
    }
}
