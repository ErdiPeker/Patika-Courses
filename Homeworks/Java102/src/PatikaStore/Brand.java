package PatikaStore;

import java.util.Set;
import java.util.TreeSet;

public class Brand implements Comparable<Brand> {
    private String name;
    private int id;
    public static TreeSet<Brand> brandList = new TreeSet<>();

    static {
        brandList.add(new Brand("Samsung",1));
        brandList.add(new Brand("Lenovo",2));
        brandList.add(new Brand("Apple",3));
        brandList.add(new Brand("Huawei",4));
        brandList.add(new Brand("Casper",5));
        brandList.add(new Brand("Asus",6));
        brandList.add(new Brand("HP",7));
        brandList.add(new Brand("Xiaomi",8));
        brandList.add(new Brand("Monster",9));
    }

    public Brand(String name, int id) {
        this.name = name;
        this.id = id;
        brandList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public int compareTo(Brand o) {
        return this.name.compareTo(o.name);
    }

    public static void printBrands(){
        for(Brand b : Brand.brandList){
            System.out.println(b.getName());
        }
    }
}
