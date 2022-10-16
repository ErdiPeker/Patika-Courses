package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int first,second,operation,result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        first=input.nextInt();
        System.out.print("Enter the second number:");
        second=input.nextInt();
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Choose the operation:");
        operation=input.nextInt();

        switch (operation){
            case 1:
                System.out.println("Addition:" + (first+second));
                break;
            case 2:
                System.out.println("Subtraction:" + (first-second));
                break;
            case 3:
                System.out.println("Multiplication:" + (first*second));
                break;
            case 4:
                if(second!=0){
                    System.out.println("Division:" + (first/second));
                }else{
                    System.out.println("Error: division by zero" );
                }
            default:
                System.out.println("Wrong operation. Try again!");
        }


    }
}
