import java.util.Random;

public class Passenger {
    private String name;
    ContactInfo contactInfo;
    int uniqueId;


    public Passenger (String name, ContactInfo contactInfo){
        Random random = new Random();
        this.name = name;
        this.contactInfo = contactInfo;
        this.uniqueId = random.nextInt();
    }
}
