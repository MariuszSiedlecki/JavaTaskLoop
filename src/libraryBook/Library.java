package libraryBook;

import libraryBook.Book;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList <Book> books = new ArrayList<Book>();
        books.add(new Book("O psie który jeździł koleją","Roman Pisarski",83234));
        books.add(new Book("Lalka","Bolesław Prus", 121212));

        for(Book b:books){
            System.out.println("Title: " + b.getTitle()+ " ,author: " +b.getAuthor()+ " ,ISBN: " +b.getIsbn());

        }

    }

}
