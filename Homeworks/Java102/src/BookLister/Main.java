package BookLister;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Harry Potter", 350, "J.K.Rowling"));
        bookList.add(new Book("Lord of the Rings", 550, "J.R.R.Tolkien"));
        bookList.add(new Book("The Count of Monte Cristo", 250, "Alexandre Dumas"));
        bookList.add(new Book("The Game of Thrones", 450, "George R.R. Martin"));
        bookList.add(new Book("To Kill a Mockingbird", 350, "Harper Lee"));
        bookList.add(new Book("The Little Prince", 90, "Antoine de Saint-Exupery"));
        bookList.add(new Book("Siddhartha", 440, "Herman Hesse"));
        bookList.add(new Book("Candide", 570, "Voltaire"));
        bookList.add(new Book("The Girl with the Dragon Tattoo", 320, "Stieg Larsson"));
        bookList.add(new Book("The Alchemist", 170, "Paulo Coelho"));

        System.out.println("---------------------------------------------");
        Map<String, String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getName(), book.getAuthorName()));
        for (String key : bookMap.keySet()) {
            System.out.println("Book name : " + key + ", Author : " + bookMap.get(key));
        }

        System.out.println("---------------------------------------------");
        List<Book> filteredBookList = bookList.stream().filter(book -> book.getPageNumber() > 100).toList();

        filteredBookList.forEach(book -> System.out.println(book.getName()));
        System.out.println("Total : "+ filteredBookList.size());

        System.out.println("---------------------------------------------");
    }
}
