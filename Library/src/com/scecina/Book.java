package com.scecina;

public class Book {


    private String title;
    private  int pageNumber;
    private String author;
    private String borowedTime = "In library";
    private String returnTime = "In Library";
    private String location = "Library";


    public Book(String title, int pageNumber, String author) {

        this.title = title;
        this.pageNumber = pageNumber;
        this.author = author;
        this.borowedTime = borowedTime;
        this.returnTime =returnTime;
        this.location = location;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBorowedTime() {
        return borowedTime;
    }

    public void setBorowedTime(String borowedTime) {
        this.borowedTime = borowedTime;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        String s = "Title: " + this.getTitle() + ", author: " + this.getAuthor() + ", page count: " + this.getPageNumber() + ", book is at: " +this.getLocation() + ", book borrow time: " + this.getBorowedTime() + ", book return time: " + this.getReturnTime();
        return s;
    }
}
