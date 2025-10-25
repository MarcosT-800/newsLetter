package newsletter;

import newsletter.publisher.NewsletterManager;
import newsletter.subscribers.EmailSubscriber;
import newsletter.subscribers.SmsSubscriber;

public class Demo {
    public static void main(String[] args) {
        NewsletterManager manager = new NewsletterManager();

        // Assinantes se inscrevem na newsletter
        manager.subscribe(new EmailSubscriber("ana@example.com"));
        manager.subscribe(new EmailSubscriber("carlos@example.com"));
        manager.subscribe(new SmsSubscriber("+55 11 99999-1234"));

        NewsletterService service = new NewsletterService(manager);

        // Publica uma nova edição
        service.publish("Promoções de Outubro", "Confira os descontos exclusivos da semana!");

        // Publica outra edição
        service.publish("Novidades de Novembro", "Lançamos um novo produto incrível!");
    }
}
