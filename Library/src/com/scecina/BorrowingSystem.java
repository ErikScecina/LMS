package com.scecina;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class BorrowingSystem {
    private Library library;
    public BorrowingSystem (Library library){
        this.library = library;
    }

    private ArrayList<Book> booksInLibrary = new ArrayList<>();
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();


    public void setBooksInLibrary(Book book) {
//        this.booksInLibrary = booksInLibrary;

        this.booksInLibrary.add(book);
    }

    public void setBorrowedBooks(Book book) {
//        this.borrowedBooks = borrowedBooks;

        this.borrowedBooks.add(book);
    }



    public void arrangeBooks(){

        booksInLibrary.clear();
        borrowedBooks.clear();

        for (int i = 0; i < this.library.booksList.size(); i++) {

            if(this.library.booksList.get(i).getLocation() == "Library") {
                setBooksInLibrary(this.library.booksList.get(i));
            } else {
                setBorrowedBooks(this.library.booksList.get(i));
            }
        }

    }

    void booksInLibList(){

        for (int i = 0; i < booksInLibrary.size(); i++) {
            System.out.println("Book No. " + i + ": " + booksInLibrary.get(i).toString());
        }

    }

    void borrowedBooksList(){

        for (int i = 0; i < borrowedBooks.size(); i++) {
            System.out.println("Book No. " + i + ": " + borrowedBooks.get(i).toString());
        }

    }

    void borrowBook(int custID, int bookID) {

       if(this.library.customerList.get(custID).getBorrowedBooks().size() < 3) {
           String cborrow = this.library.customerList.get(custID).getFirstName() + " " + this.library.customerList.get(custID).getLastName();
           for(int i=0; i < this.library.booksList.size(); i++){
               if(this.library.booksList.get(i).getTitle() == this.booksInLibrary.get(bookID).getTitle()){
                   this.library.booksList.get(i).setLocation(cborrow);
                   this.library.booksList.get(i).setBorowedTime(dtf.format(now));
                   String bBook = this.library.booksList.get(i).getTitle();
                   this.library.customerList.get(custID).setBorrowedBooks(bBook);
               }


           }


       } else {
           System.out.println(" You already borrowed three books, please return atleast one before borrowing a new one");
       }

    }

    void customerBorwedBooks(int custID){

        this.library.customerBorrowedArray(custID);

        if(this.library.customerList.get(custID).getBorrowedBooks().size() == 0){

            System.out.println("You have no borrowed books");

//
        }

    }


    void returnBook(int custID, int bookID ){
//
        String lib = "Library";
        this.library.customerBorrowedArray(custID);
        System.out.println(this.library.customerList.get(custID).getBorrowedBook(bookID));
        if(this.library.customerList.get(custID).getBorrowedBooks().size() > 0) {
           for(int i=0; i<this.library.booksList.size();i++) {
              if(this.library.booksList.get(i).getTitle() == this.library.customerList.get(custID).getBorrowedBook(bookID)){
                  this.library.booksList.get(i).setLocation(lib);
                  this.library.booksList.get(i).setReturnTime(dtf.format(now));
                  this.library.customerList.get(custID).getBorrowedBooks().remove(bookID);

              }



           }
        } else {
            System.out.println(" You dont have any borrowed books");
        }


        }


    }

