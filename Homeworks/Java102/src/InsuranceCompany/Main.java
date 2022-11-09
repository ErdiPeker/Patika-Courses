package InsuranceCompany;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        AccountManager n= new AccountManager();

        Account account=getCredentials(n);
        account.showUserInfo();

    }
    public static Account getCredentials(AccountManager n){
        System.out.print("Email : ");
        String email = input.next();
        System.out.print("Password : ");
        String password = input.next();

        return n.login(email,password);
    }
}
