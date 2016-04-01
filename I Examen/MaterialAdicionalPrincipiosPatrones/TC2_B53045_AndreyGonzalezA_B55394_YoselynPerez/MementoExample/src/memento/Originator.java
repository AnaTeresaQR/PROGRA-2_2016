/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;

/**
 *
 * @author yosel
 */
public class Originator {
    private ArrayList books = new ArrayList();
    
    public Object getMemento(){
        return new BookMemento(books);
    }
    
    public void setMemento(Object object){
            BookMemento memento = (BookMemento)object;
            books = memento.state;
    }
    
    //_____________________________________________________
    private class BookMemento{
        private ArrayList state;
        
        private BookMemento(ArrayList books){
            this.state = books;
        }
    }
    
    //_____________________________________________________
       
    public Originator(ArrayList newBooks){
        books = newBooks;
    }
    
    public Originator() {
    }
    
    public void addBook(Book book){
        if(books.contains(book) == false) {
            books.add(book);
        }
    }
    
    public void removeBook(Book book) {
        books.remove(book);
    }
    
    public void removeAllBooks() {
       books = new ArrayList();
    }
    
    public ArrayList getBooks() {
        return books;
    }
    
    public String toString(){
        return books.toString();
    }
}
    

