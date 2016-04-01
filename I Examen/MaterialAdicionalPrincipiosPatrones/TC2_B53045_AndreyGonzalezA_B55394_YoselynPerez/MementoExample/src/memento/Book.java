/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author yosel
 */
public class Book {
    private String name;
    private String editorial;
    private String author;
    private int year;

    public Book(String name, String editorial, String author, int year) {
        this.name = name;
        this.editorial = editorial;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" + "Nombre:" + name + ", autor=" + author +  ", editorial=" + editorial + ", año=" + year + '}';
    }
    
    
}
