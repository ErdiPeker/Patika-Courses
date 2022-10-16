package UserAuthentication;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password,changeConsent,newPassword;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName=input.nextLine();
        System.out.print("Şifreniz : ");
        password=input.nextLine();

        if(userName.equals("patika")){
            if(password.equals("java123")){
                System.out.println("Giriş Yaptınız !");
            }
            else{
                System.out.print("Şifrenizi değiştimek ister misiniz? (Y/N) : ");
                changeConsent= input.nextLine();
                if(changeConsent.equals("Y")){
                    System.out.print("Yeni Şifrenizi Giriniz : ");
                    newPassword=input.nextLine();
                    if(newPassword.equals("java123")){
                        System.out.println("Şifre Olusturulamadı! Lütfen başka şifre deneyiniz.");
                    }else{
                        System.out.println("Yeni Şifre Oluşturuldu!");
                    }
                }else{
                    System.out.println("Tekrar Deneyiniz!");
                }

            }

        }else{
            System.out.println("Bilgileriniz Yanlış !");
        }

    }

}
