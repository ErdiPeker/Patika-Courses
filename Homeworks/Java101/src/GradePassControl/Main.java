package GradePassControl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fiz,kim,turkce,muzik,total,course=5;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        mat=input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fiz=input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kim=input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce=input.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik=input.nextInt();

        total=mat+muzik+fiz+kim+turkce;

        if(mat<0 || mat>100){
            total-=mat;
            course--;
        }
        if(fiz<0 || fiz>100){
            total-=fiz;
            course--;
        }
        if(kim<0 || kim>100){
            total-=kim;
            course--;
        }
        if(turkce<0 || turkce>100){
            total-=turkce;
            course--;
        }
        if(muzik<0 || muzik>100){
            total-=muzik;
            course--;
        }

        double average=total/course;

        if(average<55){
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere!");
        }else{
            System.out.println("Tebrikler! Sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız : " + average);
    }
}
