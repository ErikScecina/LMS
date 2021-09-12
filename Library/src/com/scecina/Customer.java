package com.scecina;

import java.util.ArrayList;

public class Customer {

  private String firstName;
  private String lastName;
  private String adress;
  private int adressNumber;
  private String city;
  private String country;
  private ArrayList<String> borrowedBooks = new ArrayList<>();

    public Customer(String firstName, String lastName,String adress, int adressNumber, String city, String country){

        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.adressNumber = adressNumber;
        this.city = city;
        this.country = country;
        this.borrowedBooks = borrowedBooks;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAdressNumber() {
        return adressNumber;
    }

    public void setAdressNumber(int adressNumber) {
        this.adressNumber = adressNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    String getBorrowedBook(int i){
        return borrowedBooks.get(i);
    }

    public void setBorrowedBooks(String borrowedBooks) {
        this.borrowedBooks.add(borrowedBooks);
    }

    @Override
    public String toString() {
        String s = "first name: " + this.firstName + ", last name: " + this.lastName + ", adress: " + this.adress + ", adress number: " +this.adressNumber + ", city: " + this.city + ", Country: " + this.country + ", borrowd books: " + this.borrowedBooks;
        return s;
    }
}
