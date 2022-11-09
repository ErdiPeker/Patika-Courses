package PatikaStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Phone extends Products implements Comparable<Phone> {
    private String battery;
    private String color;
    public static Set<Phone> phoneList = new TreeSet<>();

    static {
        phoneList.add(new Phone(1, "Samsung GALAXY A52", "Samsung", 400, 10, 400, "16GB", "128GB", "3.54''", "5000MAH", "black"));
        phoneList.add(new Phone(2, "iPhone 11 64GB", "Apple", 300, 5, 300, "64GB", "512GB", "4.1''", "3000MAH", "rose"));
        phoneList.add(new Phone(3, "RedMi Note 10 Pro", "Xiaomi", 350, 15, 200, "8GB", "256GB", "4.2''", "4200MAH", "gold"));

    }

    public Phone(int id, String name, String brand, double price, double discount, int stock, String ram, String memory, String screenSize, String battery, String color) {
        super(id, name, brand, price, discount, stock, ram, memory, screenSize);
        this.battery = battery;
        this.color = color;
        phoneList.add(this);
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void printPhones() {
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size  | Battery    | RAM        | COLOR      |");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------");
        for (Phone product : phoneList) {
            System.out.printf(
                    "| %-2s | %-31s| %-8s $ | %-10s | %-10s | %-12s | %-10s | %-10s | %-10s |\n",
                    product.getId(), product.getName(), product.getPrice(), product.getBrand(),
                    product.getMemory(), product.getScreenSize(), product.getBattery(), product.getRam(),
                    product.getColor());
        }
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public int compareTo(Phone o) {
        return this.getName().compareTo(o.getName());
    }
}
