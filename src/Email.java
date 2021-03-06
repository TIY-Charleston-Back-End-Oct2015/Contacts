/**
 * Created by zach on 10/8/15.
 */
public class Email {
    public String subject; // this is a subject -zach
    public String body; // this is a body -zach
    public String destination; // this is a destination -zach
    public int timestamp; // this is a timestamp -zach

    public Email() {
        System.out.println("Creating email...");
        subject = "No Subject";
        body = "";
        destination = "";
        timestamp = 0;
    }

    public Email(String subject, String body, String destination, int timestamp) {
        this.subject = subject;
        this.body = body;
        this.destination = destination;
        this.timestamp = timestamp;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public static boolean isValidSubject(String subject) {
        return subject.length() != 0;
    }

    public boolean isValidSubject() {
        return isValidSubject(subject);
    }
}
