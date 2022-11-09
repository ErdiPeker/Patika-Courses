package InsuranceCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Account implements Comparable{
    enum AuthenticationStatus {SUCCESS,FAIL}
    private User user;
    private List<Insurance> insuranceList;
    private AuthenticationStatus status;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }

    public final void showUserInfo(){
        System.out.println("Welcome "+user.getName()+" "+user.getSurname()+"!");
        System.out.println("E-mail : " +user.getEmail());
        System.out.println("Occupation : "+ user.getOccupation());
        System.out.println("Age : "+ user.getAge());
    }

    public void login(String email, String password) throws InvalidAuthenticationException{
        if(this.getUser().getEmail().equals(email) && this.getUser().getPassword().equals(password)){
            setStatus(AuthenticationStatus.SUCCESS);
            System.out.println("Giriş Başarılı!");
        }else{
            setStatus(AuthenticationStatus.FAIL);
            throw new InvalidAuthenticationException("Kullanıcı bilgileri hatalı!");
        }
    }

    public void addHomeAddress(String country, String city,String address){
        AddressManager.homeAddressAdder(this.getUser(),country,city,address);
    }
    public void addBusinessAddress(String country, String city,String address){
        AddressManager.businessAddressAdder(this.getUser(),country,city,address);
    }
    public void removeHomeAddress(){
        AddressManager.homeAddressRemover(this.getUser());
    }
    public void removeBusinessAddress(){
        AddressManager.businessAddressRemover(this.getUser());
    }
    public abstract void addInsurance();

    @Override
    public int compareTo(Object o) {
        return this.hashCode()-o.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(user, account.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }
}

class InvalidAuthenticationException extends Exception {
    public InvalidAuthenticationException(String message) {
        super(message);
    }
}

class Individual extends Account{
    public Individual(User user) {
        this.setUser(user);
    }

    @Override
    public void addInsurance() {

    }
}

class Enterprise extends Account{

    public Enterprise(User user) {
        this.setUser(user);
    }

    @Override
    public void addInsurance() {

    }
}
