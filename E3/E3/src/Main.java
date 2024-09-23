import Entity.Author;
import Entity.Book;
import Entity.Gender;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Battle of the dragon", new Author("AJJ", "AJJ100@gmail.com", Gender.Male), 1000, 3));
        books.add(new Book("A new daw", new Author("Riot j.j ", "riotpoit@gmail.com", Gender.Male), 300, 10));
        books.add(new Book("Date", new Author("MJ", "MJ@gmail.com", Gender.Female), 2500, 6));
        books.add(new Book("CCC", new Author("JK", "Rowlink@gmail.com", Gender.Female), 1500, 9));

        List<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparing(Book::getName))
                .collect(Collectors.toList());

        sortedBooks.forEach(System.out::println);

        Optional<Book> maxPriceBook = books.stream()
                .max(Comparator.comparing(Book::getPrice));

        maxPriceBook.ifPresent(book ->
                System.out.println("Book with max price--> " + book));
    }
}