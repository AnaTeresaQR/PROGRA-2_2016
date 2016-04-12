package exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ana Teresa
 */
public class NewsPaper implements Observable {

    private ConcreteNew news;

    private List<User> elements = new ArrayList<>();

    @Override
    public void add(User user) {
        elements.add(user);
    }

    @Override
    public void remove(String suscriptionType) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getEmail().equals(suscriptionType)
                    || elements.get(i).getSms().equals(suscriptionType)) {
                elements.remove(i);
            }
        }
    }

    @Override
    public String alert(ConcreteNew news) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elements.size(); i++) {
            sb.append(elements.get(i).update(news)).append("\n");
        }
        return sb.toString();
    }

    public String changeNews(ConcreteNew news) {
        return alert(news);
    }

    public String setNews(ConcreteNew news) {
        this.news = news;
        return changeNews(news);
    }
}
