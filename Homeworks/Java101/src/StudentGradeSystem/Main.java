package StudentGradeSystem;

public class Main {
    public static void main(String[] args) {
        Teacher adam = new Teacher("Mahmut Hoca","123456","TRH");
        Teacher graham = new Teacher("Graham Bell","12423525","FZK");
        Teacher kul = new Teacher("Külyutmaz","12345677","BIO");

        Course tarih = new Course("Tarih","101","TRH",25);
        tarih.addTeacher(adam);
        Course fizik = new Course("Fizik","102","FZK",30);
        fizik.addTeacher(graham);
        Course biyoloji = new Course("Biyoloji","101","BIO",20);
        biyoloji.addTeacher(kul);


        Student s1 = new Student("Inek Saban","123","4",tarih,fizik,biyoloji);
        s1.addBulkExamGrades(100,27,50,83,65,67);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi","444","4",tarih,fizik,biyoloji);
        s2.addBulkExamGrades(50,30,71,90,87,89);
        s2.isPass();
    }
}
