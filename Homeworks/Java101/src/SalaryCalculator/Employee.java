package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int experience;
    double tax;
    double bonus;
    double raise;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.experience=2021-hireYear;
    }
    void tax(){
        if(this.salary>=1000){
            this.tax=this.salary*0.03;
        }
    }
    void bonus(){
        if(workHours>40){
            this.bonus=(this.workHours-40)*30;
        }
    }
    void raiseSalary(){
        if(experience<10){
            this.raise=this.salary*0.05;
        }else if(experience<20){
            this.raise=this.salary*0.10;
        }else{
            this.raise=this.salary*0.15;
        }
    }
    void toMyString(){
        tax();
        bonus();
        raiseSalary();
        System.out.println("Adı : " +this.name);
        System.out.println("Maasi : "+this.salary);
        System.out.println("Calisma Saati : "+this.workHours);
        System.out.println("Baslangic Yili : "+this.hireYear);
        System.out.println("Vergi : "+this.tax);
        System.out.println("Bonus : "+this.bonus);
        System.out.println("Maas Artisi : "+this.raise);
        double total=this.salary+this.raise+this.bonus-this.tax;
        System.out.println("Toplam Ele Gecen : "+total);
    }
}
