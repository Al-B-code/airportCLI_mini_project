import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {

    Passenger passenger;
    ContactInfo contactInfo;
    @BeforeEach
    public void setUp(){
        contactInfo = new ContactInfo("JohnSmith@email.com", "10 Downing Street", "07788229291");
        passenger = new Passenger("John Smith", contactInfo);
    }

    @Test
    public void canGetName(){
        assertThat(passenger.getName()).isEqualTo("John Smith");
    }
    @Test
    public void canSetName(){
        passenger.setName("David Smith");
        assertThat(passenger.getName()).isEqualTo("David Smith");
    }

    @Test
    public void canGetContactInfo(){
        assertThat(passenger.getContactInfo().getAddress()).isEqualTo("10 Downing Street");
        assertThat(passenger.getContactInfo().getEmail()).isEqualTo("JohnSmith@email.com");
        assertThat(passenger.getContactInfo().getPhoneNumber()).isEqualTo("07788229291");
    }

    @Test
    public void canSetContactInfo(){
        passenger.setAddress("20 Random Street");
        passenger.setNumber("01188229291");
        passenger.setEmail("SmithJohn@email.com");
        assertThat(passenger.getAddress()).isEqualTo("20 Random Street");
        assertThat(passenger.getNumber()).isEqualTo("01188229291");
        assertThat(passenger.getEmail()).isEqualTo(("SmithJohn@email.com"));
    }

}
