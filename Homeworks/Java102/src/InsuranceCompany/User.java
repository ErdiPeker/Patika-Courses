package InsuranceCompany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private int age;
    private String occupation;
    private List<Address> address = new ArrayList<>();
    private Date lastEntry;

    public User(String name, String surname, String email, String password, int age, String occupation, List<Address> address, Date lastEntry) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.occupation = occupation;
        this.address = address;
        this.lastEntry = lastEntry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Date getLastEntry() {
        return lastEntry;
    }

    public void setLastEntry(Date lastEntry) {
        this.lastEntry = lastEntry;
    }
}
