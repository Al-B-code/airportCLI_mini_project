import org.junit.jupiter.api.BeforeEach;

public class PassengerTest {

    Passenger passenger;
    ContactInfo contactInfo;
    @BeforeEach
    public void setUp(){
        contactInfo = new ContactInfo("JohnSmith@email.com", "10 Downing Street", "07788229291");
        passenger = new Passenger("John Smith", contactInfo);
    }

}
