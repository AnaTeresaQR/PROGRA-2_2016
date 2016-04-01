package exercise2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class with the attributes of a document and their respective get and gets
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class Document {

    private int id;
    private int counter; // document counter
    private String name;
    private Date date;
    private String hour;
    private int type; // enum with the document type priority 

    public Document(int id, String name, Date date, int type) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.type = type;
        this.counter = 0;
        hour = new SimpleDateFormat("HH:mm:ss")
                .format(date); // establishes a specific time format
    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
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

    public String getHour() {
        return hour;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return counter + "  Document{" + "id: " + id + ", name: " + name + ", date: " + date.toLocaleString() + ", hour: " + hour + ", type: " + type + '}';
    }
}
