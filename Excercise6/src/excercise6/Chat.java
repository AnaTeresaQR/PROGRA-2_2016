/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise6;

/**
 *
 * @author alelizmu
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
