package StudentGradeSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPassed;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPassed= false;
    }

    void addBulkExamGrades(int test1,int oral1,int test2, int oral2,int test3,int oral3){
        if(test1>=0 && test1<=100){
            this.c1.testGrade=test1;
        }
        if(test2>=0 && test2<=100){
            this.c2.testGrade=test2;
        }
        if(test3>=0 && test3<=100){
            this.c3.testGrade=test3;
        }
        if(oral1>=0 && oral1<=100){
            this.c1.oralGrade=oral1;
        }
        if(oral2>=0 && oral2<=100){
            this.c2.oralGrade=oral2;
        }
        if(oral3>=0 && oral3<=100){
            this.c3.oralGrade=oral3;
        }
    }

    void calcFinalGrades(){
        this.c1.grade=((100-this.c1.percentOral)*this.c1.testGrade+this.c1.oralGrade*this.c1.percentOral)/100.00;
        this.c2.grade=((100-this.c2.percentOral)*this.c2.testGrade+this.c2.oralGrade*this.c2.percentOral)/100.00;
        this.c3.grade=((100-this.c3.percentOral)*this.c3.testGrade+this.c3.oralGrade*this.c3.percentOral)/100.00;
    }

    void printGrades(){
        calcFinalGrades();
        System.out.println(this.c1.name + " Notu\t: "+ this.c1.grade);
        System.out.println(this.c2.name + " Notu\t: "+ this.c2.grade);
        System.out.println(this.c3.name + " Notu\t: "+ this.c3.grade);
        System.out.println("Ortalamanız : " + this.average);

    }

    void isPass(){
        this.average=(this.c1.grade+this.c2.grade+this.c3.grade)/3.0;
        System.out.println("=============================================");
        if(this.average>55.0){
            System.out.println(this.name);
            System.out.println("Hababam sinifi uyaniyor!");
            this.isPassed=true;
        }else{
            System.out.println(this.name);
            System.out.println("Hababam sinifi sinifta kaldi!");
        }
        printGrades();
    }
}
