package exercise6;

/**
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class Chat {

    private String text;

    private static Chat instance;

    private Chat() {

    }

    public static Chat getInstance() {
        if (instance == null) {
            return instance = new Chat();
        } else {
            return instance;
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {

        if (this.text == null) {
            this.text = text;
        } else {
            this.text = getText().concat("\n" + text);
        }
    }
}
