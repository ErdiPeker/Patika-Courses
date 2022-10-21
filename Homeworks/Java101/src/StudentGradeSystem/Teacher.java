package StudentGradeSystem;

public class Teacher {
    String name;
    String phone;
    String branch;

    Teacher(String name,String phone,String branch){
        this.name=name;
        this.branch=branch;
        this.phone=phone;
    }

    void print(){
        System.out.println("Name : "+ this.name);
        System.out.println("Phone : "+ this.phone);
        System.out.println("Branch : "+ this.branch);
    }

}
