package newsletter.subscribers;

public class EmailSubscriber implements Subscriber {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String subject, String content) {
        System.out.println("[Email enviado para " + email + "]");
        System.out.println("Assunto: " + subject);
        System.out.println("Conteúdo: " + content);
        System.out.println("-----------------------------------");
    }
}
