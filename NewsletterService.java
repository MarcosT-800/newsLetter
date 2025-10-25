package newsletter;

import newsletter.publisher.NewsletterManager;

public class NewsletterService {
    private NewsletterManager manager;

    public NewsletterService(NewsletterManager manager) {
        this.manager = manager;
    }

    public void publish(String subject, String content) {
        System.out.println("\nPublicando nova newsletter: " + subject);
        manager.notifySubscribers(subject, content);
    }
}
