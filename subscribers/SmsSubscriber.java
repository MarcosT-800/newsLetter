package newsletter.subscribers;

public class SmsSubscriber implements Subscriber {
    private String phoneNumber;

    public SmsSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String subject, String content) {
        System.out.println("[SMS enviado para " + phoneNumber + "]");
        System.out.println("Mensagem: " + subject + " - " + content);
        System.out.println("-----------------------------------");
    }
}
