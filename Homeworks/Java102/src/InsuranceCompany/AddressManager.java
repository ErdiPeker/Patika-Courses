package InsuranceCompany;

public class AddressManager {
    public static void homeAddressAdder(User user, String country,String city,String address){
        user.getAddress().add(0,new HomeAddress(country,city,address));
    }
    public static void homeAddressChanger(User user, String country,String city,String address){
        user.getAddress().get(0).changeAddress(country,city,address);
    }
    public static void homeAddressRemover(User user){
        user.getAddress().remove(0);
    }
    public static void businessAddressAdder(User user, String country,String city,String address){
        user.getAddress().add(1,new HomeAddress(country,city,address));
    }
    public static void businessAddressChanger(User user, String country,String city,String address){
        user.getAddress().get(1).changeAddress(country,city,address);
    }
    public static void businessAddressRemover(User user){
        user.getAddress().remove(1);
    }
}
