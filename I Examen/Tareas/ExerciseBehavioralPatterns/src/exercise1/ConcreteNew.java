package exercise1;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class ConcreteNew {

    private String header;
    private Date date;

    public ConcreteNew() {
    }

    public ConcreteNew(String header, Date date) {
        this.header = header;
        this.date = date;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ConcreteNew{" + "header: " + header + ", dat: " + date.toLocaleString() + '}';
    }

}
