package MatriceTranpose;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {5, 6}, {7, 8}};
        int[][] tr= new int[mat[0].length][mat.length];

        for(int i=0; i< mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                tr[j][i]=mat[i][j];
            }
        }
        for(int[] row : tr){
            System.out.println(Arrays.toString(row));
        }
    }
}
