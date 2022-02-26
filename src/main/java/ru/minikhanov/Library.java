package ru.minikhanov;

public class Library {
    private Book books;

    //IoC
    /*public Library(Book books) {
        this.books = books;
    }*/

    public Library() {
    }

    public void setBooks(Book books) {
        this.books = books;
    }

    public void readBookInLibrary(){
        System.out.println("Read:" + books.readBook());
    }
}
