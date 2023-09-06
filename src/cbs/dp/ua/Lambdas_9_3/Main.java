package cbs.dp.ua.Lambdas_9_3;

import java.util.ArrayList;
import java.util.List;

// На скільки зрозумів завдання  - на стільки зробив ((

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        AddBook addBook = new AddBook() {
            @Override
            public Book adds() {
                return new Book("The Sea Wolf", "Jack London", 425);
            }
        };

        books.add(addBook.adds());

//---------------------------------------------------

        addBook = () -> new Book("Romeo and Juliet", "William Shakespeare", 281);
        books.add(addBook.adds());

//---------------------------------------------------

       addBook = Book::new;
        books.add(addBook.adds());

        books.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");

        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + " author: " + book.getAuthor() + " number pages: " + book.getNumbPages());
        }
    }
}
