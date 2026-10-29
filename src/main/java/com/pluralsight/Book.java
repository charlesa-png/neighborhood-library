package com.pluralsight;

public class Book {
    public int id;
    public String isbn;
    public String title;
    public boolean isCheckedOut;
    public String checkedOutTo;

    public Book(int id,
                String isbn,
                String title){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void checkOut(String name) {
        this.checkedOutTo = name;
        isCheckedOut = true;
    }
    public void checkIn(){
        isCheckedOut = false;
        checkedOutTo = "";
    }
}

