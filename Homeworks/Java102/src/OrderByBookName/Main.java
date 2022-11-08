package OrderByBookName;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> bookList = new TreeSet<>();
        bookList.add(new Book("Böyle Buyurdu Zerdüşt",600,"Nietzche","1880"));
        bookList.add(new Book("Faust",500,"Nietzche","1890"));
        bookList.add(new Book("Sisifos Söyleni",300,"Camus","1910"));
        bookList.add(new Book("Şato",450,"Kafka","1930"));
        bookList.add(new Book("Alamut Kalesi",750,"Bartol","1880"));

        for(Book book: bookList){
            System.out.println(book.getName());
        }

        TreeSet<Book> bookList2 = new TreeSet<>(Comparator.comparingInt(Book::getPageNumber));
        bookList2.addAll(bookList);
        for(Book book: bookList2){
            System.out.println(book.getPageNumber());
        }
    }
}
