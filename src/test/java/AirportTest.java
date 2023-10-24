import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AirportTest {
    Airport airport;


    @BeforeEach
    public void setUp(){
        airport = new Airport("Stanstead");
        airport.addNewPassenger("John Smith", "johnsmith@email.com", "10 Downing Street", "07788229291");
        airport.addNewFlight("Paris");
        airport.bookPassenger("Paris", airport.airportPassengers.get(0).getUniqueId());
    }




}
