package ArrayLetterBWriter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [][] arr = new String[9][5];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==0 || i== arr.length-1 || i==arr.length/2){
                    arr[i][j]="*";
                } else if (j ==0 || j== arr[i].length-1) {
                    arr[i][j]="*";
                }else{
                    arr[i][j]=" ";
                }
            }
        }
        for(String[] row: arr ){
            for(String letter : row){
                System.out.print(letter);
            }
            System.out.println("");
        }
    }
}
