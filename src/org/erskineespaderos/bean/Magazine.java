package org.erskineespaderos.bean;

import java.util.ArrayList;
import java.util.Date;

public class Magazine extends Publication{

    private int id;
    
    public Magazine(String title, Date edititionDate, String editorial) {
        super(title, edititionDate, editorial);
    }
    
    public int getId(){
        return id;
    }
    
    @Override
    public String toString(){
        return "Magazine: " + this.getTitle() + " - " + this.getEditorial();
    }
    
    public static ArrayList<Magazine> makeMAgazineList(){
        return null;
    }
}
