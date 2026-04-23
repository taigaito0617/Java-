package 基礎2.演習4.演習4_3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private  ArrayList<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
    }

    public void displayBooks() {
        for (String book : books) {
            System.out.println(book);
        }
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }
    
    
}
