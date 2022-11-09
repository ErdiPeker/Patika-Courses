package InsuranceCompany;

import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts = new TreeSet<>();

    public AccountManager() {
        accounts = new TreeSet<>();
        accounts.add(new Enterprise(new User("Murat","Peker","murat@peker","123","doktor",31)));
        accounts.add(new Individual(new User("Sahin","Kaya","sahin@kaya","123","ogrenci",17)));
        accounts.add(new Individual(new User("Mehmet","Kala","mehmet@kala","123","memur",23)));
    }

    public Account login(String email, String password) {
        for (Account account : accounts) {
            if (account.getUser().getEmail().equals(email)) {
                try {
                    account.login(email, password);
                    if (account.getStatus()== Account.AuthenticationStatus.SUCCESS){

                        return account;
                    }
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        return null;
    }
}
