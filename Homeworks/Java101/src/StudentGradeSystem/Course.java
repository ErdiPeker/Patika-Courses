package StudentGradeSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double grade;
    int oralGrade;
    int testGrade;
    int percentOral;

    Course(String name,String code,String prefix,int percentOral){
        this.name=name;
        this.prefix=prefix;
        this.code=code;
        this.grade=0;
        this.percentOral=percentOral;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else{
            System.out.println("Öğretmen ve ders alanı uyuşmuyor.");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }
}
