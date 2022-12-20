package ru.mirea.task2.opt3;

public class Book {
    int NumberOfPages;
    String NameOfBook;
    public Book(String NameOfBook, int NaumberOfPages){
        this.NumberOfPages = NumberOfPages;
        this.NameOfBook = NameOfBook;
    }
    public String Print(){
        return "Название книги "+NameOfBook+"\nКоличество страниц "+ NumberOfPages;
    }
}
