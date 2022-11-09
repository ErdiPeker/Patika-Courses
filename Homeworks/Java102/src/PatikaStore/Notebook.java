package PatikaStore;

import java.util.Set;
import java.util.TreeSet;

public class Notebook extends Products implements Comparable<Notebook>{
    public static Set<Notebook> notebookList= new TreeSet<>();

    static {
        notebookList.add(new Notebook(1,"Huawei Matebook 14","Huawei",700,10,400,"16GB","1TB","14''"));
        notebookList.add(new Notebook(2,"Lenovo V14 IGL","Lenovo",500,5,100,"12GB","512GB","13''"));
        notebookList.add(new Notebook(3,"Asus TUF Gaming","Asus",600,6,200,"32GB","2TB","14''"));

    }
    public Notebook(int id, String name, String brand, double price, double discount, int stock, String ram, String memory, String screenSize) {
        super(id, name, brand, price, discount, stock, ram, memory, screenSize);
        notebookList.add(this);
    }

    public static void printNotebooks(){
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println(
                "| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size  | RAM        |");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        for (Notebook product : notebookList){
            System.out.printf("| %-2s | %-30s| %-9s $ | %-11s| %-10s| %-12s | %-10s |\n",
                    product.getId(), product.getName(), product.getPrice(), product.getBrand(),
                    product.getMemory(), product.getScreenSize(), product.getRam());
        }
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
    }

    @Override
    public int compareTo(Notebook o) {
        return this.getName().compareTo(o.getName());
    }
}
