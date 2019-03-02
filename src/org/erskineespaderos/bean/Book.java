package org.erskineespaderos.bean;

import java.util.ArrayList;
import java.util.Date;
import org.erskineespaderos.interfaces.IVisualizable;

public class Book extends Publication implements IVisualizable{
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    //Constructor 
    public Book(String title, Date edititionDate, String editorial, String [] autors) {
        super(title, edititionDate, editorial);
        super.setAutor(autors);
        
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    //Metodo String toString
    @Override
    public String toString(){
      return "Book: " + this.getIsbn() + " - " + this.getTitle();  
    }
    
    //Metodo ArrayList
    public static ArrayList<Book> makeBookList(){
        return null;
    }
    
    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        Long valor = dateF.getTime() - dateI.getTime();
        this.timeReaded = valor.intValue();
    }
}
