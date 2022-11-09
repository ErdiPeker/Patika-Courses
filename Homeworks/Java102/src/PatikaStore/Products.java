package PatikaStore;

import PatikaStore.Brand;

public abstract class Products {
    private int id;
    private String name;
    private String brand;
    private double price;
    private double discount;
    private int stock;
    private String ram;
    private String memory;
    private String screenSize;

    public Products(int id, String name, String brand, double price, double discount, int stock, String ram, String memory, String screenSize) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.ram = ram;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
