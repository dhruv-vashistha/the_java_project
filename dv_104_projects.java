package com.company;
import java.util.LinkedList;

//in this code we are storing the multiple objects of different values to the linkedList
class Book{
    public String book;
    public String author;
    public String issuedTo;
    public String issuedOn;

    //making a constructor here
    public Book(String bookName, String AuthorName){
        this.book = bookName;
        this.author = AuthorName;
        this.issuedOn = null;
        this.issuedTo = null;
    }

    //making a method
    public String toString(){
        return "Book: " + book + "| by: " + author + "| issued to: " + issuedTo + "| issued on: " + issuedOn;
    }
}
class MYLibrary{
    LinkedList<Book> books = new LinkedList<>();

    //while adding a book we just need the name of book and the author
    public void addBook(String Book, String author){
        books.add(new Book(Book, author));
        System.out.println("your book named " + Book + " has added to the list");
    }

    //display all the books available
    public void showAllBooks(){
        for (Book b: books){
            System.out.println(b);
        }
    }

    //return books method
    public void returnBook(String bookname){
        for (Book b: books){
            if (b.book.equalsIgnoreCase(bookname) && b.issuedTo != null){
                b.issuedTo = null;
                b.issuedOn = null;
                System.out.println("your book named " + b.book + " has returned to the library");
                return;
            }

        }System.out.println("the book you named is either already there in library or the duplicate is present there!");

    }

    //issueBook method
    public void issueBook(String bookname, String issuedToName){
        for (Book b : books){
            if (b.book.equalsIgnoreCase(bookname) && b.issuedTo == null){
                b.issuedTo = issuedToName;
                b.issuedOn = java.time.LocalDate.now().toString();
                System.out.println("your book " + b.book + " has issued successfully on " + b.issuedOn);

                return;
            }

        }
        System.out.println("book is either not available or has already issued to someone else");
    }
}

public class dv_104_projects {
    public static void main(String[] args) {
        //making two classes one for library and another for the book
        MYLibrary a = new MYLibrary();
        a.addBook("one piece" , "Oda");
        a.addBook("Jujutsu kaisen", "akutami");
        a.addBook("Naruto" , "Kishimoto");
        a.addBook("Avengers" , "Marvel");

        System.out.println("getting all the books present after adding the books to the library");
        a.showAllBooks();

        a.issueBook("Avengers" , "Dhruv");
        System.out.println("displaying the books after issuing one");
        a.showAllBooks();

        a.returnBook("Avengers");
        System.out.println("displaying the books after returning the book");
        a.showAllBooks();
    }
}
