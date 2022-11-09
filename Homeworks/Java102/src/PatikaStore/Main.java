package PatikaStore;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Patika Store Urun Yonetim Paneli !");
        System.out.println("1-Notebook Islemleri");
        System.out.println("2-Cep Telefonu Islemleri");
        System.out.println("3-Markaları Listele");
        System.out.println("0-Cıkıs Yap");
        System.out.print("Seçiminiz : ");
        int choice = input.nextInt();

        while (true){
            switch (choice){
                case 1:
                    System.out.println("Notebook Paneli !");
                    System.out.println("1-Notebook Listele");
                    System.out.println("2-Notebook Ekle");
                    System.out.println("2-Notebook Sil");
                    System.out.print("Seçiminiz : ");
                    int choice2 = input.nextInt();
                    switch (choice2){
                        case 1:
                            Notebook.printNotebooks();
                            break;
                        case 2:
                            System.out.print("ID: ");
                            int idscanner = input.nextInt();
                            System.out.print("Unit Price: ");
                            double unitPricesscanner = input.nextDouble();
                            System.out.print("Discount Rate: ");
                            double discountRatesscanner = input.nextDouble();
                            System.out.print("Stock: ");
                            int stocksscanner = input.nextInt();
                            System.out.print("Brand: ");
                            String brandsscanner = input.next();
                            System.out.print("Model: ");
                            String modelsscanner = input.next();
                            System.out.print("Storage: ");
                            String storagesscanner = input.next();
                            System.out.print("Screen Size: ");
                            String screenSizesscanner = input.next();
                            System.out.print("RAM: ");
                            String RAMscanner = input.nextLine();
                            Notebook n = new Notebook(idscanner,modelsscanner,brandsscanner,unitPricesscanner,discountRatesscanner,stocksscanner,RAMscanner,storagesscanner,screenSizesscanner);
                            break;

                    }


            }
        }


    }
}
