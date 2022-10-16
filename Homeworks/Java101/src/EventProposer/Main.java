package EventProposer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz : ");
        temp = input.nextInt();

        System.out.println("Uygun Aktiviteler: ");
        if(temp<5){
            System.out.println("-Kayak");
        }else if (temp <=25){
            if (temp <=15){
                System.out.println("-Sinema");
            }
            if(temp>=10){
                System.out.println("-Piknik");
            }
        }else{
            System.out.println("-Yüzme");
        }
    }
}