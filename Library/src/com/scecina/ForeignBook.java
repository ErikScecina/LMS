package com.scecina;

public class ForeignBook extends Book {

    private String language;

    public ForeignBook(String title, int pageNumber, String author, String language) {
        super(title, pageNumber, author);
        this.language = language;
    }

    @Override
    public String toString() {
        String s = "Title: " + this.getTitle() + ", author: " + this.getAuthor() + ", page count: " + this.getPageNumber() + "language: " +this.language + ", book is at: " +this.getLocation() + ", book borrow time: " + this.getBorowedTime() + ", book return time: " + this.getReturnTime();
        return s;
    }

}
