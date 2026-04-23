package 基礎2.演習4.演習4_3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Java入門");
        library.addBook("Python入門");
        
        List<String> books = library.getBooks();
        for (String book : books) {
            System.out.println(book);
        }
    }

    
    
}
