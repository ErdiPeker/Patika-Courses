package MineSweeperGame;

import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int column;
    int mineNumber;
    String[][] map;
    String[][] table;

    MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.map = new String[this.row][this.column];
        this.table = new String[this.row][this.column];
        this.mineNumber = (int) Math.floor(this.row * this.column / 4.0);
    }

    void run() {
        mapBuilder();
        tableBuilder();
        int guess = this.column * this.row - this.mineNumber;
        Scanner input = new Scanner(System.in);

        while (guess>0) {
            System.out.println("========================");
            for(int i=0;i<this.row;i++){
                for(int j=0;j<this.column;j++){
                    System.out.print(table[i][j]+"  ");
                }
                System.out.println();
            }
            System.out.print("Row :");
            int i = input.nextInt();
            System.out.print("Column :");
            int j = input.nextInt();

            if(i<0 ||i>=this.row || j<0 || j>= this.column){
                System.out.println("Wrong location");
            }else if(map[i][j].equals("*")){
                System.out.println("Game Over!");
                break;
            }else {
                this.table[i][j]=this.map[i][j];
                guess--;
            }
        }
        System.out.println("Congratulations!");


    }

    void tableBuilder() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                this.table[i][j] = "-";
            }
        }
    }

    void mapBuilder() {
        int[] mines = mineLocations();
        for (int mine : mines) {
            int i = mine / this.column;
            int j = mine % this.column;
            this.map[i][j] = "*";
        }
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (this.map[i][j] == null) {
                    int n = mineCounter(i, j);
                    this.map[i][j] = String.valueOf(n);
                }
            }
        }
        for (String[] row : this.map) {
            System.out.println(Arrays.toString(row));
        }
    }

    int[] mineLocations() {
        int range = row * column;
        int[] mineArray = new int[this.mineNumber];
        int i = 0;
        while (i < this.mineNumber) {
            int rand = (int) Math.floor(Math.random() * range);
            if (!isExists(mineArray, rand)) {
                mineArray[i] = rand;
                i++;
            }
        }
        return mineArray;

    }

    boolean isExists(int[] arr, int num) {
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }

    int mineCounter(int i, int j) {
        int cnt = 0;
        for (int a = i - 1; a <= i + 1; a++) {
            for (int b = j - 1; b <= j + 1; b++) {
                if (a < 0 || a >= this.row || b < 0 || b >= this.column || this.map[a][b] != "*") {
                } else {
                    cnt++;
                }
            }
        }
        return cnt;
    }


}
