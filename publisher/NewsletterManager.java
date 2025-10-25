package newsletter.publisher;

import newsletter.subscribers.Subscriber;
import java.util.ArrayList;
import java.util.List;

public class NewsletterManager {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String subject, String content) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(subject, content);
        }
    }
}
