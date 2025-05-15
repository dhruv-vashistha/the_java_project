package com.company;

class Library{
    String[] Books;
    boolean[] isIssued;
    int noOfBooks;
    //constructor
    public Library(){
        this.Books = new String[100];
        this.isIssued = new boolean[100];
        this.noOfBooks = 0;
    }
    //add books method
    public void addBook(String Book){
        this.Books[noOfBooks] = Book;
        this.isIssued[noOfBooks] = false;
        this.noOfBooks++;
        System.out.println("Book named " + Book + " is added to the library.");
    }
    //issue books method
    public void issueBook(String Book){
        for (int i = 0; i<noOfBooks; i++){
            if (this.Books[i].equalsIgnoreCase(Book) && !isIssued[i]) {
                this.isIssued[i] = true;
                System.out.println("the book named " + Book + " has been issued.");
                return;
            }
        }
        System.out.println("your book does not found.");
    }
    //return books method
    public void ReturnBook(String Book){
        for (int i = 0; i<noOfBooks; i++){
            if (this.Books[i].equalsIgnoreCase(Book) && isIssued[i]) {
                this.isIssued[i] = false;
                System.out.println("the book named " + Book + " has returned to the library.");
                return;
            }
        }
        System.out.println("your book does not found.");
    }
    //show available books method
    public void showAvailable(){
        for (int i = 0; i< noOfBooks; i++){
            if (!this.isIssued[i]){
                System.out.println("* " + Books[i]);
            }
            else{
                System.out.println("- " + Books[i] + " is not available");
            }
        }
    }

}
public class dv_51_library_project {
    public static void main(String[] args) {
        /*
        you have to implement the Library using the java class named Library
        Methods - addBook, issueBook, returnBook, showAvailableBooks
        properties - 1.array to store the available books
                     2.array to store the stored books
         */
        Library lb = new Library();
        //adding the books
        lb.addBook("maths");
        lb.addBook("science");
        lb.addBook("english");
        lb.addBook("java");
        //show the available books
        lb.showAvailable();
        //issue a book
        lb.issueBook("maths");
        lb.issueBook("java");
        //show the available books
        lb.showAvailable();
        //returning a book
        lb.ReturnBook("java");
        //show available books
        lb.showAvailable();
        //testing the issued books
        lb.issueBook("mining");


    }
}
