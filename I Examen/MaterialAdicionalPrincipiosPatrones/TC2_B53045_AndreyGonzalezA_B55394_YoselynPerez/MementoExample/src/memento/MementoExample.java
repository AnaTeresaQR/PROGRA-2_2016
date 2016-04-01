/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author andrey
 */
public class MementoExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Book book1 = new Book("El principito", "Oceano","Antoine", 1943);
      Book book2 = new Book("Crepusculo", "Little","Stephenie M", 2005);
      Book book3 = new Book("El amor en el tiempo de Colera", "Alfred A.","Gabriel Garcia M", 1985);
      Book book4 = new Book("Harry Potter", "Salamandra","JK Rolling", 1997);
      Book book5 = new Book("Orgullo y Prejuicio", "Thomas E.","Jane Austen", 1813);
      
      Originator ori = new Originator();
      ori.addBook(book1);
      ori.addBook(book2);
      ori.addBook(book3);
      ori.addBook(book4);
      ori.addBook(book5);
      
        System.out.println("Muestra toda la lista\n" + ori);
        Object memento = ori.getMemento();
        
//        ori.removeBook(book2);
//        ori.removeBook(book4);
        
        ori.removeAllBooks();
        
        System.out.println("Lista modificada\n" + ori);
        ori.setMemento(memento);
        
        System.out.println("Lista restaurada\n" + ori);
        
    }
    
}
