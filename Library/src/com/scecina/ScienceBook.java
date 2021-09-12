package com.scecina;

public class ScienceBook extends Book {

   private String scienceField;


    public ScienceBook(String title, int pageNumber, String author, String scienceField) {
        super(title, pageNumber, author);
        this.scienceField = scienceField;
    }

    public String getScienceField() {
        return scienceField;
    }

    public void setScienceField(String scienceField) {
        this.scienceField = scienceField;
    }

    @Override
    public String toString() {
        String s = "Title: " + this.getTitle() + ", author: " + this.getAuthor() + ", page count: " + this.getPageNumber() + "science field: " +this.scienceField + ", book is at: " +this.getLocation() + ", book borrow time: " + this.getBorowedTime() + ", book return time: " + this.getReturnTime();
        return s;
    }

}
