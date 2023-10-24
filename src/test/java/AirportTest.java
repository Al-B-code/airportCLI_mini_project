import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.setLenientDateParsing;


public class AirportTest {


    Airport airport;
    @BeforeEach
    public void setUp(){
        airport = new Airport("Stanstead");
        airport.addNewPassenger("John Smith", "johnsmith@email.com", "10 Downing Street", "07788229291");
        airport.addNewFlight("Paris");
        airport.bookPassenger("Paris", airport.airportPassengers.get(0).getUniqueId());
    }


    @Test
    public void canAddPassenger(){
        airport.addNewPassenger("David Wallace", "davidwallace@email.com", "12 Downing Street", "02211229291");
        assertThat(airport.airportPassengers.size()).isEqualTo(2);
    }

    @Test
    public void canAddNewFlight(){
        airport.addNewFlight("Barcelona");
        assertThat(airport.flights.size()).isEqualTo(2);
    }

    @Test
    public void canDisplayFlights(){
        assertThat(airport.displayFlights().size()).isEqualTo(1);
    }

    @Test
    public void canBookPassenger(){
        airport.addNewFlight("Barcelona");
        airport.bookPassenger("Barcelona", airport.airportPassengers.get(0).getUniqueId());
        assertThat(airport.flights.get(1).getPassengers().size()).isEqualTo(1);
    }
    @Test
    public void canRemovePassenger(){
        airport.addNewFlight("Barcelona");
        airport.bookPassenger("Barcelona", airport.airportPassengers.get(0).getUniqueId());
        assertThat(airport.flights.get(1).getPassengers().size()).isEqualTo(1);
        airport.removePassenger("Barcelona", airport.airportPassengers.get(0).getUniqueId());
        assertThat(airport.flights.get(1).getPassengers().size()).isEqualTo(0);
    }

    @Test
    public void canRemoveFlight(){
        airport.addNewFlight("Barcelona");
        assertThat(airport.flights.size()).isEqualTo(2);
        airport.removeFlight("Barcelona");
        assertThat(airport.flights.size()).isEqualTo(1);
    }








}
