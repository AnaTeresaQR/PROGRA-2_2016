package exercise2;

import java.util.Date;

/**
 * Class with the attributes of a document and their respective get and gets
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class Document {

    private int id;
    private static int counter; // document counter
    private String name;
    private Date date;
    private int type; // enum with the document type priority 

    public Document(String name, Date date, int type) {
        this.id = counter;
        this.name = name;
        this.date = date;
        this.type = type;
        Document.counter++;
    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        Document.counter = counter;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "  Document{" + "id: " + id + ", Name: " + name + ", Date: " + date.toLocaleString() + ", Type: " + type + '}';
    }
}
