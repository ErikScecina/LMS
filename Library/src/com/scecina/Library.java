package com.scecina;


import java.util.ArrayList;

public class Library {




   public ArrayList<Book> booksList = new ArrayList<>();

    public ArrayList<Customer> customerList = new ArrayList<>();

    public void setBooks(Book book) {
        this.booksList = booksList;

        this.booksList.add(book);
    }



    void arrayToString(){

        for (int i = 0; i < booksList.size(); i++) {
            System.out.println("Book No. " + i + ": " + booksList.get(i).toString());
        }

    }



    public void setCustomer(Customer customer) {
        this.customerList = customerList;

        this.customerList.add(customer);
    }



    void customerArrayToString(){

        for (int i = 0; i < customerList.size(); i++) {
            System.out.println("Customer No. " + i + ": " + customerList.get(i).toString());
        }

    }

    void customerBorrowedArray(int custID){
        for(int i = 0; i < customerList.get(custID).getBorrowedBooks().size(); i++ ){
            System.out.println("Borrowed books for this customer are " + i + ": " + customerList.get(custID).getBorrowedBook(i));
        }

    }

}
